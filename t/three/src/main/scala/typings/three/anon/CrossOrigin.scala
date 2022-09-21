package typings.three.anon

import org.scalablytyped.runtime.StringDictionary
import typings.three.ktx2loaderMod.KTX2Loader
import typings.three.threeMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrossOrigin extends StObject {
  
  var crossOrigin: String
  
  var ktx2Loader: KTX2Loader
  
  var manager: LoadingManager
  
  var meshoptDecoder: /* MeshoptDecoder */ Any
  
  var path: String
  
  var requestHeader: StringDictionary[String]
}
object CrossOrigin {
  
  inline def apply(
    crossOrigin: String,
    ktx2Loader: KTX2Loader,
    manager: LoadingManager,
    meshoptDecoder: /* MeshoptDecoder */ Any,
    path: String,
    requestHeader: StringDictionary[String]
  ): CrossOrigin = {
    val __obj = js.Dynamic.literal(crossOrigin = crossOrigin.asInstanceOf[js.Any], ktx2Loader = ktx2Loader.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], meshoptDecoder = meshoptDecoder.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requestHeader = requestHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossOrigin]
  }
  
  extension [Self <: CrossOrigin](x: Self) {
    
    inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setKtx2Loader(value: KTX2Loader): Self = StObject.set(x, "ktx2Loader", value.asInstanceOf[js.Any])
    
    inline def setManager(value: LoadingManager): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
    
    inline def setMeshoptDecoder(value: /* MeshoptDecoder */ Any): Self = StObject.set(x, "meshoptDecoder", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRequestHeader(value: StringDictionary[String]): Self = StObject.set(x, "requestHeader", value.asInstanceOf[js.Any])
  }
}
