package typings.timezoneSupport

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object data20122022Mod extends Shortcut {
  
  @JSImport("timezone-support/dist/data-2012-2022", JSImport.Default)
  @js.native
  val default: TimeZoneData = js.native
  
  type PackedTimeZones = StringDictionary[String]
  
  trait TimeZoneData extends StObject {
    
    var links: js.Array[String]
    
    var zones: PackedTimeZones
  }
  object TimeZoneData {
    
    inline def apply(links: js.Array[String], zones: PackedTimeZones): TimeZoneData = {
      val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], zones = zones.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeZoneData]
    }
    
    extension [Self <: TimeZoneData](x: Self) {
      
      inline def setLinks(value: js.Array[String]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksVarargs(value: String*): Self = StObject.set(x, "links", js.Array(value :_*))
      
      inline def setZones(value: PackedTimeZones): Self = StObject.set(x, "zones", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = TimeZoneData
  
  /* This means you don't have to write `default`, but can instead just say `data20122022Mod.foo` */
  override def _to: TimeZoneData = default
}
