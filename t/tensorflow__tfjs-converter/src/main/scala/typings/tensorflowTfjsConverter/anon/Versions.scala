package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Versions extends StObject {
  
  var node: js.Array[
    Device | AttrDevice | DeviceInput | AttrDeviceInput | DeviceInputName | AttrDeviceInputName
  ]
  
  var versions: Producer
}
object Versions {
  
  inline def apply(
    node: js.Array[
      Device | AttrDevice | DeviceInput | AttrDeviceInput | DeviceInputName | AttrDeviceInputName
    ],
    versions: Producer
  ): Versions = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Versions]
  }
  
  extension [Self <: Versions](x: Self) {
    
    inline def setNode(
      value: js.Array[
          Device | AttrDevice | DeviceInput | AttrDeviceInput | DeviceInputName | AttrDeviceInputName
        ]
    ): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeVarargs(
      value: (Device | AttrDevice | DeviceInput | AttrDeviceInput | DeviceInputName | AttrDeviceInputName)*
    ): Self = StObject.set(x, "node", js.Array(value*))
    
    inline def setVersions(value: Producer): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
  }
}
