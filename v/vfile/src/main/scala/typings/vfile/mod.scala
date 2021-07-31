package typings.vfile

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.std.Uint8Array
import typings.unist.mod.Node
import typings.unist.mod.Point
import typings.unist.mod.Position
import typings.vfileMessage.mod.VFileMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("vfile", JSImport.Namespace)
  @js.native
  val ^ : js.Object & VFile = js.native
  
  /**
    * Encodings supported by the buffer class
    *
    * @remarks
    * This is a copy of the typing from Node, copied to prevent Node globals from being needed.
    * Copied from https://github.com/DefinitelyTyped/DefinitelyTyped/blob/a2bc1d868d81733a8969236655fa600bd3651a7b/types/node/globals.d.ts#L174
    */
  /* Rewritten from type alias, can be one of: 
    - typings.vfile.vfileStrings.ascii
    - typings.vfile.vfileStrings.utf8
    - typings.vfile.vfileStrings.`utf-8`
    - typings.vfile.vfileStrings.utf16le
    - typings.vfile.vfileStrings.ucs2
    - typings.vfile.vfileStrings.`ucs-2`
    - typings.vfile.vfileStrings.base64
    - typings.vfile.vfileStrings.latin1
    - typings.vfile.vfileStrings.binary
    - typings.vfile.vfileStrings.hex
  */
  trait BufferEncoding extends StObject
  object BufferEncoding {
    
    @scala.inline
    def ascii: typings.vfile.vfileStrings.ascii = "ascii".asInstanceOf[typings.vfile.vfileStrings.ascii]
    
    @scala.inline
    def base64: typings.vfile.vfileStrings.base64 = "base64".asInstanceOf[typings.vfile.vfileStrings.base64]
    
    @scala.inline
    def binary: typings.vfile.vfileStrings.binary = "binary".asInstanceOf[typings.vfile.vfileStrings.binary]
    
    @scala.inline
    def hex: typings.vfile.vfileStrings.hex = "hex".asInstanceOf[typings.vfile.vfileStrings.hex]
    
    @scala.inline
    def latin1: typings.vfile.vfileStrings.latin1 = "latin1".asInstanceOf[typings.vfile.vfileStrings.latin1]
    
    @scala.inline
    def `ucs-2`: typings.vfile.vfileStrings.`ucs-2` = "ucs-2".asInstanceOf[typings.vfile.vfileStrings.`ucs-2`]
    
    @scala.inline
    def ucs2: typings.vfile.vfileStrings.ucs2 = "ucs2".asInstanceOf[typings.vfile.vfileStrings.ucs2]
    
    @scala.inline
    def `utf-8`: typings.vfile.vfileStrings.`utf-8` = "utf-8".asInstanceOf[typings.vfile.vfileStrings.`utf-8`]
    
    @scala.inline
    def utf16le: typings.vfile.vfileStrings.utf16le = "utf16le".asInstanceOf[typings.vfile.vfileStrings.utf16le]
    
    @scala.inline
    def utf8: typings.vfile.vfileStrings.utf8 = "utf8".asInstanceOf[typings.vfile.vfileStrings.utf8]
  }
  
  type Settings = StringDictionary[js.Any]
  
  @js.native
  trait VFile
    extends StObject
       with /* key */ StringDictionary[js.Any]
       with _VFileCompatible {
    
    /**
      * Create a new virtual file. If `options` is `string` or `Buffer`, treats it as `{contents: options}`.
      * If `options` is a `VFile`, returns it. All other options are set on the newly created `vfile`.
      *
      * Path related properties are set in the following order (least specific to most specific): `history`, `path`, `basename`, `stem`, `extname`, `dirname`.
      *
      * It’s not possible to set either `dirname` or `extname` without setting either `history`, `path`, `basename`, or `stem` as well.
      *
      * @param options If `options` is `string` or `Buffer`, treats it as `{contents: options}`. If `options` is a `VFile`, returns it. All other options are set on the newly created `vfile`.
      */
    def apply[F /* <: VFile */](): F = js.native
    def apply[F /* <: VFile */](input: F | VFileContents): F = js.native
    def apply[F /* <: VFile */](input: VFileOptions): F = js.native
    
    /**
      * Current name (including extension) of `vfile`.
      * Cannot contain path separators.
      * Cannot be nullified either (use `file.path = file.dirname` instead).
      */
    var basename: js.UndefOr[String] = js.native
    
    /**
      * Raw value.
      */
    var contents: VFileContents = js.native
    
    /**
      * Base of `path`.
      * Defaults to `process.cwd()`.
      */
    var cwd: String = js.native
    
    /**
      * Place to store custom information.
      * It's OK to store custom data directly on the `vfile`, moving it to `data` gives a little more privacy.
      */
    var data: js.Any = js.native
    
    /**
      * Path to parent directory of `vfile`.
      * Cannot be set if there's no `path` yet.
      */
    var dirname: js.UndefOr[String] = js.native
    
    /**
      * Extension (with dot) of `vfile`.
      * Cannot be set if there's no `path` yet and cannot contain path separators.
      */
    var extname: js.UndefOr[String] = js.native
    
    /**
      * Associates a fatal message with the file, then immediately throws it.
      * Note: fatal errors mean a file is no longer processable.
      * Calls `message()` internally.
      * @param reason Reason for message. Uses the stack and message of the error if given.
      * @param position Place at which the message occurred in `vfile`.
      * @param ruleId Category of message.
      */
    def fail(reason: String): scala.Nothing = js.native
    def fail(reason: String, position: Unit, ruleId: String): scala.Nothing = js.native
    def fail(reason: String, position: Node): scala.Nothing = js.native
    def fail(reason: String, position: Node, ruleId: String): scala.Nothing = js.native
    def fail(reason: String, position: Point): scala.Nothing = js.native
    def fail(reason: String, position: Point, ruleId: String): scala.Nothing = js.native
    def fail(reason: String, position: Position): scala.Nothing = js.native
    def fail(reason: String, position: Position, ruleId: String): scala.Nothing = js.native
    
    /**
      * List of file-paths the file moved between.
      */
    var history: js.Array[String] = js.native
    
    /**
      * Associates an informational message with the file, where `fatal` is set to `null`.
      * Calls `message()` internally.
      * @param reason Reason for message. Uses the stack and message of the error if given.
      * @param position Place at which the message occurred in `vfile`.
      * @param ruleId Category of message.
      */
    def info(reason: String): VFileMessage = js.native
    def info(reason: String, position: Unit, ruleId: String): VFileMessage = js.native
    def info(reason: String, position: Node): VFileMessage = js.native
    def info(reason: String, position: Node, ruleId: String): VFileMessage = js.native
    def info(reason: String, position: Point): VFileMessage = js.native
    def info(reason: String, position: Point, ruleId: String): VFileMessage = js.native
    def info(reason: String, position: Position): VFileMessage = js.native
    def info(reason: String, position: Position, ruleId: String): VFileMessage = js.native
    
    /**
      * Associates a message with the file for `reason` at `position`.
      * When an error is passed in as `reason`, copies the stack.
      * Each message has a `fatal` property which by default is set to `false` (ie. `warning`).
      * @param reason Reason for message. Uses the stack and message of the error if given.
      * @param position Place at which the message occurred in `vfile`.
      * @param ruleId Category of message.
      */
    def message(reason: String): VFileMessage = js.native
    def message(reason: String, position: Unit, ruleId: String): VFileMessage = js.native
    def message(reason: String, position: Node): VFileMessage = js.native
    def message(reason: String, position: Node, ruleId: String): VFileMessage = js.native
    def message(reason: String, position: Point): VFileMessage = js.native
    def message(reason: String, position: Point, ruleId: String): VFileMessage = js.native
    def message(reason: String, position: Position): VFileMessage = js.native
    def message(reason: String, position: Position, ruleId: String): VFileMessage = js.native
    
    /**
      * List of messages associated with the file.
      */
    var messages: js.Array[VFileMessage] = js.native
    
    /**
      * Path of `vfile`.
      * Cannot be nullified.
      */
    var path: js.UndefOr[String] = js.native
    
    /**
      * Name (without extension) of `vfile`.
      * Cannot be nullified, and cannot contain path separators.
      */
    var stem: js.UndefOr[String] = js.native
    
    def toString(encoding: BufferEncoding): String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vfile.mod.VFile
    - typings.vfile.mod.VFileOptions
    - typings.vfile.mod.VFileContents
  */
  type VFileCompatible = _VFileCompatible | VFileContents
  
  /**
    * VFileContents can either be text, or a Buffer like structure
    * @remarks
    * This does not directly use type `Buffer, because it can also be used in a browser context.
    * Instead this leverages `Uint8Array` which is the base type for `Buffer`, and a native JavaScript construct.
    */
  type VFileContents = String | Uint8Array
  
  trait VFileOptions
    extends StObject
       with /* key */ StringDictionary[js.Any]
       with _VFileCompatible {
    
    var basename: js.UndefOr[String] = js.undefined
    
    var contents: js.UndefOr[VFileContents] = js.undefined
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[js.Any] = js.undefined
    
    var dirname: js.UndefOr[String] = js.undefined
    
    var extname: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var stem: js.UndefOr[String] = js.undefined
  }
  object VFileOptions {
    
    @scala.inline
    def apply(): VFileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VFileOptions]
    }
    
    @scala.inline
    implicit class VFileOptionsMutableBuilder[Self <: VFileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      @scala.inline
      def setContents(value: VFileContents): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDirname(value: String): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirnameUndefined: Self = StObject.set(x, "dirname", js.undefined)
      
      @scala.inline
      def setExtname(value: String): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtnameUndefined: Self = StObject.set(x, "extname", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setStem(value: String): Self = StObject.set(x, "stem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStemUndefined: Self = StObject.set(x, "stem", js.undefined)
    }
  }
  
  type VFileReporter[T] = js.Function2[/* files */ js.Array[VFile], /* options */ T, String]
  
  type _To = js.Object & VFile
  
  trait _VFileCompatible extends StObject
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & VFile = ^
}
