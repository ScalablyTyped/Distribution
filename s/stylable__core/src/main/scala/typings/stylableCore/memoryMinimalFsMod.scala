package typings.stylableCore

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.stylableCore.anon.Fs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memoryMinimalFsMod {
  
  @JSImport("@stylable/core/cjs/memory-minimal-fs", "createMinimalFS")
  @js.native
  def createMinimalFS(hasFilesTrimWS: MinimalFSSetup): Fs = js.native
  
  @js.native
  trait File extends StObject {
    
    var content: String = js.native
    
    var mtime: js.UndefOr[Date] = js.native
  }
  object File {
    
    @scala.inline
    def apply(content: String): File = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    @scala.inline
    implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtime(value: Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
    }
  }
  
  @js.native
  trait MinimalFSSetup extends StObject {
    
    var files: StringDictionary[File] = js.native
    
    var trimWS: js.UndefOr[Boolean] = js.native
  }
  object MinimalFSSetup {
    
    @scala.inline
    def apply(files: StringDictionary[File]): MinimalFSSetup = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[MinimalFSSetup]
    }
    
    @scala.inline
    implicit class MinimalFSSetupMutableBuilder[Self <: MinimalFSSetup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFiles(value: StringDictionary[File]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimWS(value: Boolean): Self = StObject.set(x, "trimWS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimWSUndefined: Self = StObject.set(x, "trimWS", js.undefined)
    }
  }
}
