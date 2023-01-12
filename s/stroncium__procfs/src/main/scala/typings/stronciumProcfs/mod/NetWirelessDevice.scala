package typings.stronciumProcfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetWirelessDevice extends StObject {
  
  var discardedCrypt: Double
  
  var discardedFrag: Double
  
  var discardedMisc: Double
  
  var discardedNwid: Double
  
  var discardedRetry: Double
  
  var level: Double
  
  var link: Double
  
  var missedBeacons: Double
  
  var name: String
  
  var noise: Double
}
object NetWirelessDevice {
  
  inline def apply(
    discardedCrypt: Double,
    discardedFrag: Double,
    discardedMisc: Double,
    discardedNwid: Double,
    discardedRetry: Double,
    level: Double,
    link: Double,
    missedBeacons: Double,
    name: String,
    noise: Double
  ): NetWirelessDevice = {
    val __obj = js.Dynamic.literal(discardedCrypt = discardedCrypt.asInstanceOf[js.Any], discardedFrag = discardedFrag.asInstanceOf[js.Any], discardedMisc = discardedMisc.asInstanceOf[js.Any], discardedNwid = discardedNwid.asInstanceOf[js.Any], discardedRetry = discardedRetry.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], missedBeacons = missedBeacons.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], noise = noise.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetWirelessDevice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetWirelessDevice] (val x: Self) extends AnyVal {
    
    inline def setDiscardedCrypt(value: Double): Self = StObject.set(x, "discardedCrypt", value.asInstanceOf[js.Any])
    
    inline def setDiscardedFrag(value: Double): Self = StObject.set(x, "discardedFrag", value.asInstanceOf[js.Any])
    
    inline def setDiscardedMisc(value: Double): Self = StObject.set(x, "discardedMisc", value.asInstanceOf[js.Any])
    
    inline def setDiscardedNwid(value: Double): Self = StObject.set(x, "discardedNwid", value.asInstanceOf[js.Any])
    
    inline def setDiscardedRetry(value: Double): Self = StObject.set(x, "discardedRetry", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLink(value: Double): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setMissedBeacons(value: Double): Self = StObject.set(x, "missedBeacons", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNoise(value: Double): Self = StObject.set(x, "noise", value.asInstanceOf[js.Any])
  }
}
