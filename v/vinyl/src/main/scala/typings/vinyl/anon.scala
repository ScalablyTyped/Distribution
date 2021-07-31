package typings.vinyl

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined vinyl.vinyl.ConstructorOptions & {  contents :null} */
  trait ConstructorOptionscontent
    extends StObject
       with /* customProperty */ StringDictionary[js.Any] {
    
    /**
      * Used for relative pathing. Typically where a glob starts. Default: options.cwd
      */
    var base: js.UndefOr[String] = js.undefined
    
    /**
      * File contents.
      * Type: `Buffer`, `Stream`, or null
      * Default: null
      */
    var contents: (js.UndefOr[Buffer | ReadableStream | Null]) & Null
    
    /**
      * The current working directory of the file. Default: process.cwd()
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      * Stores the path history. If `options.path` and `options.history` are both passed,
      * `options.path` is appended to `options.history`. All `options.history` paths are
      * normalized by the `file.path` setter.
      * Default: `[]` (or `[options.path]` if `options.path` is passed)
      */
    var history: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Full path to the file.
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * The result of an fs.stat call. This is how you mark the file as a directory or
      * symbolic link. See `isDirectory()`, `isSymbolic()` and `fs.Stats` for more information.
      * http://nodejs.org/api/fs.html#fs_class_fs_stats
      */
    var stat: js.UndefOr[Stats] = js.undefined
  }
  object ConstructorOptionscontent {
    
    @scala.inline
    def apply(contents: (js.UndefOr[Buffer | ReadableStream | Null]) & Null): ConstructorOptionscontent = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConstructorOptionscontent]
    }
    
    @scala.inline
    implicit class ConstructorOptionscontentMutableBuilder[Self <: ConstructorOptionscontent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      @scala.inline
      def setContents(value: (js.UndefOr[Buffer | ReadableStream | Null]) & Null): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setHistory(value: js.Array[String]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      @scala.inline
      def setHistoryVarargs(value: String*): Self = StObject.set(x, "history", js.Array(value :_*))
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setStat(value: Stats): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatUndefined: Self = StObject.set(x, "stat", js.undefined)
    }
  }
  
  /* Inlined vinyl.vinyl.ConstructorOptions & {  contents :node.NodeJS.ReadableStream} */
  trait ConstructorOptionscontentBase
    extends StObject
       with /* customProperty */ StringDictionary[js.Any] {
    
    /**
      * Used for relative pathing. Typically where a glob starts. Default: options.cwd
      */
    var base: js.UndefOr[String] = js.undefined
    
    /**
      * File contents.
      * Type: `Buffer`, `Stream`, or null
      * Default: null
      */
    var contents: (js.UndefOr[Buffer | ReadableStream | Null]) & ReadableStream
    
    /**
      * The current working directory of the file. Default: process.cwd()
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      * Stores the path history. If `options.path` and `options.history` are both passed,
      * `options.path` is appended to `options.history`. All `options.history` paths are
      * normalized by the `file.path` setter.
      * Default: `[]` (or `[options.path]` if `options.path` is passed)
      */
    var history: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Full path to the file.
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * The result of an fs.stat call. This is how you mark the file as a directory or
      * symbolic link. See `isDirectory()`, `isSymbolic()` and `fs.Stats` for more information.
      * http://nodejs.org/api/fs.html#fs_class_fs_stats
      */
    var stat: js.UndefOr[Stats] = js.undefined
  }
  object ConstructorOptionscontentBase {
    
    @scala.inline
    def apply(contents: (js.UndefOr[Buffer | ReadableStream | Null]) & ReadableStream): ConstructorOptionscontentBase = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConstructorOptionscontentBase]
    }
    
    @scala.inline
    implicit class ConstructorOptionscontentBaseMutableBuilder[Self <: ConstructorOptionscontentBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      @scala.inline
      def setContents(value: (js.UndefOr[Buffer | ReadableStream | Null]) & ReadableStream): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setHistory(value: js.Array[String]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      @scala.inline
      def setHistoryVarargs(value: String*): Self = StObject.set(x, "history", js.Array(value :_*))
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setStat(value: Stats): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatUndefined: Self = StObject.set(x, "stat", js.undefined)
    }
  }
  
  /* Inlined vinyl.vinyl.ConstructorOptions & {  contents :node.Buffer} */
  trait ConstructorOptionscontentDictcustomOption
    extends StObject
       with /* customProperty */ StringDictionary[js.Any] {
    
    /**
      * Used for relative pathing. Typically where a glob starts. Default: options.cwd
      */
    var base: js.UndefOr[String] = js.undefined
    
    /**
      * File contents.
      * Type: `Buffer`, `Stream`, or null
      * Default: null
      */
    var contents: (js.UndefOr[Buffer | ReadableStream | Null]) & Buffer
    
    /**
      * The current working directory of the file. Default: process.cwd()
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      * Stores the path history. If `options.path` and `options.history` are both passed,
      * `options.path` is appended to `options.history`. All `options.history` paths are
      * normalized by the `file.path` setter.
      * Default: `[]` (or `[options.path]` if `options.path` is passed)
      */
    var history: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Full path to the file.
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * The result of an fs.stat call. This is how you mark the file as a directory or
      * symbolic link. See `isDirectory()`, `isSymbolic()` and `fs.Stats` for more information.
      * http://nodejs.org/api/fs.html#fs_class_fs_stats
      */
    var stat: js.UndefOr[Stats] = js.undefined
  }
  object ConstructorOptionscontentDictcustomOption {
    
    @scala.inline
    def apply(contents: (js.UndefOr[Buffer | ReadableStream | Null]) & Buffer): ConstructorOptionscontentDictcustomOption = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConstructorOptionscontentDictcustomOption]
    }
    
    @scala.inline
    implicit class ConstructorOptionscontentDictcustomOptionMutableBuilder[Self <: ConstructorOptionscontentDictcustomOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      @scala.inline
      def setContents(value: (js.UndefOr[Buffer | ReadableStream | Null]) & Buffer): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setHistory(value: js.Array[String]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      @scala.inline
      def setHistoryVarargs(value: String*): Self = StObject.set(x, "history", js.Array(value :_*))
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setStat(value: Stats): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatUndefined: Self = StObject.set(x, "stat", js.undefined)
    }
  }
  
  trait Contents extends StObject {
    
    var contents: js.UndefOr[Boolean] = js.undefined
    
    var deep: js.UndefOr[Boolean] = js.undefined
  }
  object Contents {
    
    @scala.inline
    def apply(): Contents = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Contents]
    }
    
    @scala.inline
    implicit class ContentsMutableBuilder[Self <: Contents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContents(value: Boolean): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
      
      @scala.inline
      def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
    }
  }
  
  trait End extends StObject {
    
    /**
      * If false, the destination stream will not be ended (same as node core).
      */
    var end: js.UndefOr[Boolean] = js.undefined
  }
  object End {
    
    @scala.inline
    def apply(): End = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit class EndMutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    }
  }
}
