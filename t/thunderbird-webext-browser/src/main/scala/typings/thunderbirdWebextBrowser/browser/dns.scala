package typings.thunderbirdWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dns {
  
  trait DNSRecord extends StObject {
    
    var addresses: js.Array[String]
    
    /**
      * The canonical hostname for this record. this value is empty if the
      * record was not fetched with the 'canonical_name' flag.
      */
    var canonicalName: js.UndefOr[String] = js.undefined
    
    /** Record retreived with TRR. */
    var isTRR: String
  }
  object DNSRecord {
    
    inline def apply(addresses: js.Array[String], isTRR: String): DNSRecord = {
      val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], isTRR = isTRR.asInstanceOf[js.Any])
      __obj.asInstanceOf[DNSRecord]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DNSRecord] (val x: Self) extends AnyVal {
      
      inline def setAddresses(value: js.Array[String]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      inline def setAddressesVarargs(value: String*): Self = StObject.set(x, "addresses", js.Array(value*))
      
      inline def setCanonicalName(value: String): Self = StObject.set(x, "canonicalName", value.asInstanceOf[js.Any])
      
      inline def setCanonicalNameUndefined: Self = StObject.set(x, "canonicalName", js.undefined)
      
      inline def setIsTRR(value: String): Self = StObject.set(x, "isTRR", value.asInstanceOf[js.Any])
    }
  }
  
  type ResolveFlags = js.Array[_ResolveFlags]
  
  /* Rewritten from type alias, can be one of: 
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.allow_name_collisions
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.bypass_cache
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.canonical_name
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.disable_ipv4
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.disable_ipv6
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.disable_trr
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.offline
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.priority_low
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.priority_medium
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.speculate
  */
  trait _ResolveFlags extends StObject
  object _ResolveFlags {
    
    inline def allow_name_collisions: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.allow_name_collisions = "allow_name_collisions".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.allow_name_collisions]
    
    inline def bypass_cache: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.bypass_cache = "bypass_cache".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.bypass_cache]
    
    inline def canonical_name: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.canonical_name = "canonical_name".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.canonical_name]
    
    inline def disable_ipv4: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.disable_ipv4 = "disable_ipv4".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.disable_ipv4]
    
    inline def disable_ipv6: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.disable_ipv6 = "disable_ipv6".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.disable_ipv6]
    
    inline def disable_trr: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.disable_trr = "disable_trr".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.disable_trr]
    
    inline def offline: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.offline = "offline".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.offline]
    
    inline def priority_low: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.priority_low = "priority_low".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.priority_low]
    
    inline def priority_medium: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.priority_medium = "priority_medium".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.priority_medium]
    
    inline def speculate: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.speculate = "speculate".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.speculate]
  }
}
