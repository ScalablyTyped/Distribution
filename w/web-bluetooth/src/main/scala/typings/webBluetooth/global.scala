package typings.webBluetooth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object BluetoothUUID {
    
    @JSGlobal("BluetoothUUID")
    @js.native
    val ^ : js.Any = js.native
    
    inline def canonicalUUID(alias: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("canonicalUUID")(alias.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def canonicalUUID(alias: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("canonicalUUID")(alias.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getCharacteristic(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCharacteristic")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getCharacteristic(name: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCharacteristic")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getDescriptor(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDescriptor")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getDescriptor(name: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDescriptor")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getService(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getService")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getService(name: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getService")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
