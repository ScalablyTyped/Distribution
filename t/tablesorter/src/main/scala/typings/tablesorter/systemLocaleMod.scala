package typings.tablesorter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemLocaleMod {
  
  trait Locale extends StObject {
    
    /**
      * The text to show for applying ascending sorting.
      */
    var nextAsc: String
    
    /**
      * The text to show for applying descending sorting.
      */
    var nextDesc: String
    
    /**
      * The text to show for disabling sorting.
      */
    var nextNone: String
    
    /**
      * The text to show for ascending sorting.
      */
    var sortAsc: String
    
    /**
      * The text to show for descending sorting.
      */
    var sortDesc: String
    
    /**
      * The text to show for disabled sorting.
      */
    var sortDisabled: String
    
    /**
      * The text to show for non-sorted columns.
      */
    var sortNone: String
  }
  object Locale {
    
    inline def apply(
      nextAsc: String,
      nextDesc: String,
      nextNone: String,
      sortAsc: String,
      sortDesc: String,
      sortDisabled: String,
      sortNone: String
    ): Locale = {
      val __obj = js.Dynamic.literal(nextAsc = nextAsc.asInstanceOf[js.Any], nextDesc = nextDesc.asInstanceOf[js.Any], nextNone = nextNone.asInstanceOf[js.Any], sortAsc = sortAsc.asInstanceOf[js.Any], sortDesc = sortDesc.asInstanceOf[js.Any], sortDisabled = sortDisabled.asInstanceOf[js.Any], sortNone = sortNone.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locale]
    }
    
    extension [Self <: Locale](x: Self) {
      
      inline def setNextAsc(value: String): Self = StObject.set(x, "nextAsc", value.asInstanceOf[js.Any])
      
      inline def setNextDesc(value: String): Self = StObject.set(x, "nextDesc", value.asInstanceOf[js.Any])
      
      inline def setNextNone(value: String): Self = StObject.set(x, "nextNone", value.asInstanceOf[js.Any])
      
      inline def setSortAsc(value: String): Self = StObject.set(x, "sortAsc", value.asInstanceOf[js.Any])
      
      inline def setSortDesc(value: String): Self = StObject.set(x, "sortDesc", value.asInstanceOf[js.Any])
      
      inline def setSortDisabled(value: String): Self = StObject.set(x, "sortDisabled", value.asInstanceOf[js.Any])
      
      inline def setSortNone(value: String): Self = StObject.set(x, "sortNone", value.asInstanceOf[js.Any])
    }
  }
}
