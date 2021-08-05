package typings.typedoc

import typings.typedoc.abstractMod.Reflection
import typings.typedoc.directoryMod.SourceDirectory
import typings.typedoc.reflectionGroupMod.ReflectionGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileMod {
  
  @JSImport("typedoc/dist/lib/models/sources/file", "SourceFile")
  @js.native
  class SourceFile protected () extends StObject {
    def this(fullFileName: String) = this()
    
    var fileName: String = js.native
    
    var fullFileName: String = js.native
    
    var groups: js.UndefOr[js.Array[ReflectionGroup]] = js.native
    
    var name: String = js.native
    
    var parent: js.UndefOr[SourceDirectory] = js.native
    
    var reflections: js.Array[Reflection] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  
  trait SourceReference extends StObject {
    
    var character: Double
    
    var file: js.UndefOr[SourceFile] = js.undefined
    
    var fileName: String
    
    var line: Double
    
    var url: js.UndefOr[String] = js.undefined
  }
  object SourceReference {
    
    inline def apply(character: Double, fileName: String, line: Double): SourceReference = {
      val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceReference]
    }
    
    extension [Self <: SourceReference](x: Self) {
      
      inline def setCharacter(value: Double): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
      
      inline def setFile(value: SourceFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
