package typings.three.examplesJsmLoadersIfcloaderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IfcGeometry extends StObject {
  
  def GetIndexData(): Double
  
  def GetIndexDataSize(): Double
  
  def GetVertexData(): Double
  
  def GetVertexDataSize(): Double
}
object IfcGeometry {
  
  inline def apply(
    GetIndexData: () => Double,
    GetIndexDataSize: () => Double,
    GetVertexData: () => Double,
    GetVertexDataSize: () => Double
  ): IfcGeometry = {
    val __obj = js.Dynamic.literal(GetIndexData = js.Any.fromFunction0(GetIndexData), GetIndexDataSize = js.Any.fromFunction0(GetIndexDataSize), GetVertexData = js.Any.fromFunction0(GetVertexData), GetVertexDataSize = js.Any.fromFunction0(GetVertexDataSize))
    __obj.asInstanceOf[IfcGeometry]
  }
  
  extension [Self <: IfcGeometry](x: Self) {
    
    inline def setGetIndexData(value: () => Double): Self = StObject.set(x, "GetIndexData", js.Any.fromFunction0(value))
    
    inline def setGetIndexDataSize(value: () => Double): Self = StObject.set(x, "GetIndexDataSize", js.Any.fromFunction0(value))
    
    inline def setGetVertexData(value: () => Double): Self = StObject.set(x, "GetVertexData", js.Any.fromFunction0(value))
    
    inline def setGetVertexDataSize(value: () => Double): Self = StObject.set(x, "GetVertexDataSize", js.Any.fromFunction0(value))
  }
}
