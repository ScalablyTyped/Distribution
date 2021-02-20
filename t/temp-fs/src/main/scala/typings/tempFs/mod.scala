package typings.tempFs

import typings.std.Error
import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Remove all tracked files and directories asynchronously.
    */
  @JSImport("temp-fs", "clear")
  @js.native
  def clear(): js.Any = js.native
  @JSImport("temp-fs", "clear")
  @js.native
  def clear(callback: js.Function0[_]): js.Any = js.native
  
  /**
    * Remove all tracked files and directories synchronously.
    */
  @JSImport("temp-fs", "clearSync")
  @js.native
  def clearSync(): js.Any = js.native
  
  /**
    * A tempdir.
    */
  @js.native
  trait dir extends StObject {
    
    /**
      * The absolute path to the tempdir.
      */
    var path: String = js.native
    
    /**
      * Whether {@link dir#unlink} will remove the tempdir recursively.
      */
    var recursive: Boolean = js.native
    
    /**
      * A special function for you to remove the directory.
      *
      * If the directory is not tracked, it may throw when an error occurs or
      * the first argument of the callback function will be an Error object.
      *
      * @param callback makes it asynchronous.
      */
    def unlink(): js.Any = js.native
    def unlink(callback: js.Function1[/* error */ Error, _]): js.Any = js.native
  }
  /**
    * Return the path of a system-provided tempdir as
    * <code>require('os').tmpdir()</code> does.
    *
    * You should not make any assumption about whether the path contains a
    * trailing path separator, or it is a real path. On most system it is not a
    * fixed path, and it can be changed by the user environment. When in doubt,
    * check it first.
    */
  @JSImport("temp-fs", "dir")
  @js.native
  def dir(): String = js.native
  
  /**
    * Try to create a new tempdir asynchronously.
    *
    * @param callback function receives two arguments <code>error</code> and
    *                 <code>dir</code>. If <code>error</code> is
    *                 <code>null</code>, <code>dir</code> has the properties of
    *                 {@link dir}.
    */
  @JSImport("temp-fs", "mkdir")
  @js.native
  def mkdir(): js.Any = js.native
  @JSImport("temp-fs", "mkdir")
  @js.native
  def mkdir(options: js.UndefOr[scala.Nothing], callback: js.Function2[/* err */ js.Any, /* dir */ dir, _]): js.Any = js.native
  @JSImport("temp-fs", "mkdir")
  @js.native
  def mkdir(options: options): js.Any = js.native
  @JSImport("temp-fs", "mkdir")
  @js.native
  def mkdir(options: options, callback: js.Function2[/* err */ js.Any, /* dir */ dir, _]): js.Any = js.native
  
  /**
    * The synchronous version of {@link mkdir}.
    *
    * @throws when an error happens.
    */
  @JSImport("temp-fs", "mkdirSync")
  @js.native
  def mkdirSync(): dir = js.native
  @JSImport("temp-fs", "mkdirSync")
  @js.native
  def mkdirSync(options: options): dir = js.native
  
  /**
    * Return a customized/random filename/dirname.
    */
  @JSImport("temp-fs", "name")
  @js.native
  def name(): String = js.native
  @JSImport("temp-fs", "name")
  @js.native
  def name(options: options): String = js.native
  
  /**
    * Try to open a unique tempfile asynchronously.
    *
    * @param callback function receives two arguments <code>error</code> and
    *                 <code>file</code>. If <code>error</code> is
    *                 <code>null</code>, <code>file</code> has the properties
    *                 of {@link file}.
    */
  @JSImport("temp-fs", "open")
  @js.native
  def open(): js.Any = js.native
  @JSImport("temp-fs", "open")
  @js.native
  def open(callback: js.Function2[/* err */ js.Any, /* file */ file, _]): js.Any = js.native
  @JSImport("temp-fs", "open")
  @js.native
  def open(options: js.UndefOr[scala.Nothing], callback: js.Function2[/* err */ js.Any, /* file */ file, _]): js.Any = js.native
  @JSImport("temp-fs", "open")
  @js.native
  def open(options: options): js.Any = js.native
  @JSImport("temp-fs", "open")
  @js.native
  def open(options: options, callback: js.Function2[/* err */ js.Any, /* file */ file, _]): js.Any = js.native
  
  /**
    * The synchronous version of {@link open}.
    *
    * @throws when an error happens.
    */
  @JSImport("temp-fs", "openSync")
  @js.native
  def openSync(): file = js.native
  @JSImport("temp-fs", "openSync")
  @js.native
  def openSync(options: options): file = js.native
  
  /**
    * Use it to switch global files/directories tracking on or off.
    *
    * Turn it on if you don't want to manually delete everything. When it is
    * turned off, all recorded files and directories will not be removed but
    * still kept in case it is turned on again before the program exits.
    *
    * This switch does not affect manually tracked files through
    * {@link options#track}. They will be removed automatically on exit.
    *
    * <b>Note: When an uncaught exception occurs, all tracked temporary files
    * and directories will be removed no matter it is on or off.</b>
    */
  @JSImport("temp-fs", "track")
  @js.native
  def track(): Unit = js.native
  @JSImport("temp-fs", "track")
  @js.native
  def track(on: Boolean): Unit = js.native
  
  /**
    * A tempfile.
    */
  @js.native
  trait file extends StObject {
    
    /**
      * An integer file descriptor.
      */
    var fd: Number = js.native
    
    /**
      * The absolute path to the tempfile.
      */
    var path: String = js.native
    
    /**
      * A special function for you to delete the file.
      *
      * If the file is not tracked, it may throw when an error occurs or the
      * first argument of the callback function will be an Error object.
      *
      * @param callback makes it asynchronous.
      */
    def unlink(): js.Any = js.native
    def unlink(callback: js.Function1[/* error */ Error, _]): js.Any = js.native
  }
  
  /**
    * Options.
    */
  @js.native
  trait options extends StObject {
    
    /**
      * Where to put the generated tempfile or tempdir.
      *
      * Also see {@link options#name}. Default: <code>tempfs.dir()</code>
      */
    var dir: js.UndefOr[String] = js.native
    
    /**
      * The maximum number of chance to retry before throwing an error.
      *
      * It should be a finite number. Default: 5
      */
    var limit: js.UndefOr[Number] = js.native
    
    /**
      * File mode (default: 0600) or directory mode (default: 0700) to use.
      */
    var mode: js.UndefOr[Number] = js.native
    
    /**
      * If set, join the two paths <code>{@link options#dir} ||
      * tempfs.dir()</code> and {@link options#name} together and use the
      * result as the customized filename/pathname.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * The prefix for the generated random name.
      *
      * Default: "tmp-"
      */
    var prefix: js.UndefOr[String] = js.native
    
    /**
      * Whether {@link dir#unlink} should remove a directory recursively.
      *
      * Default: false
      */
    var recursive: js.UndefOr[Boolean] = js.native
    
    /**
      * The suffix for the generated random name.
      *
      * Default: ""
      */
    var suffix: js.UndefOr[String] = js.native
    
    /**
      * A string containing some capital letters Xs for substitution with
      * random characters.
      *
      * Then it is used as part of the filename/dirname. Just like what you
      * do with the <code>mktemp(3)</code> function in the C library.
      */
    var template: js.UndefOr[String] = js.native
    
    /**
      * If set to true, let temp-fs manage the the current file/directory for
      * you even if the global tracking is off. If set to false, don't let
      * temp-fs manage it even if the global tracking is on. Otherwise, use
      * the current global setting.
      */
    var track: js.UndefOr[Boolean] = js.native
  }
  object options {
    
    @scala.inline
    def apply(): options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[options]
    }
    
    @scala.inline
    implicit class optionsMutableBuilder[Self <: options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setLimit(value: Number): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setMode(value: Number): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setTrack(value: Boolean): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
    }
  }
}
