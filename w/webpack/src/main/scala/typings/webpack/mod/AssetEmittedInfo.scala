package typings.webpack.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetEmittedInfo extends StObject {
  
  var compilation: Compilation
  
  var content: Buffer
  
  var outputPath: String
  
  var source: Source
  
  var targetPath: String
}
object AssetEmittedInfo {
  
  inline def apply(compilation: Compilation, content: Buffer, outputPath: String, source: Source, targetPath: String): AssetEmittedInfo = {
    val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], outputPath = outputPath.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], targetPath = targetPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetEmittedInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssetEmittedInfo] (val x: Self) extends AnyVal {
    
    inline def setCompilation(value: Compilation): Self = StObject.set(x, "compilation", value.asInstanceOf[js.Any])
    
    inline def setContent(value: Buffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTargetPath(value: String): Self = StObject.set(x, "targetPath", value.asInstanceOf[js.Any])
  }
}
