package typings.vscodeTextmate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object releaseJsonMod {
  
  @JSImport("vscode-textmate/release/json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseJSON(source: String, filename: String, withMetadata: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseJSON")(source.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], withMetadata.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def parseJSON(source: String, filename: Null, withMetadata: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseJSON")(source.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], withMetadata.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  trait ILocation extends StObject {
    
    val char: Double
    
    val filename: String | Null
    
    val line: Double
  }
  object ILocation {
    
    inline def apply(char: Double, line: Double): ILocation = {
      val __obj = js.Dynamic.literal(char = char.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], filename = null)
      __obj.asInstanceOf[ILocation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ILocation] (val x: Self) extends AnyVal {
      
      inline def setChar(value: Double): Self = StObject.set(x, "char", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameNull: Self = StObject.set(x, "filename", null)
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
}
