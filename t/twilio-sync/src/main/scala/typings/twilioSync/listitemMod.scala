package typings.twilioSync

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listitemMod {
  
  /**
    * @class
    * @classdesc Represents an individual element in a Sync List.
    * @alias ListItem
    * @property {Number} index The index, within the containing List, of this item. This index is stable;
    * even if lower-indexed Items are removed, this index will remain as is.
    * @property {Object} value The contents of the item.
    * @property {Date} dateUpdated Date when the List Item was last updated.
    */
  @JSImport("twilio-sync/lib/listitem", JSImport.Default)
  @js.native
  class default protected () extends ListItem {
    /**
      * @private
      * @constructor
      * @param {Object} data Item descriptor
      * @param {Number} data.index Item identifier
      * @param {String} data.uri Item URI
      * @param {Object} data.value Item data
      */
    def this(data: ListItemDescriptor) = this()
  }
  
  /**
    * @class
    * @classdesc Represents an individual element in a Sync List.
    * @alias ListItem
    * @property {Number} index The index, within the containing List, of this item. This index is stable;
    * even if lower-indexed Items are removed, this index will remain as is.
    * @property {Object} value The contents of the item.
    * @property {Date} dateUpdated Date when the List Item was last updated.
    */
  @JSImport("twilio-sync/lib/listitem", "ListItem")
  @js.native
  class ListItem protected () extends StObject {
    /**
      * @private
      * @constructor
      * @param {Object} data Item descriptor
      * @param {Number} data.index Item identifier
      * @param {String} data.uri Item URI
      * @param {Object} data.value Item data
      */
    def this(data: ListItemDescriptor) = this()
    
    val data: js.Any = js.native
    
    def dateExpires: String = js.native
    
    def dateUpdated: Date = js.native
    
    def index: Double = js.native
    
    def lastEventId: Double = js.native
    
    def revision: String = js.native
    
    /**
      * @private
      */
    def update(eventId: Double, revision: String, value: js.Object, dateUpdated: Date): ListItem = js.native
    
    /**
      * @private
      */
    def updateDateExpires(dateExpires: String): Unit = js.native
    
    def uri: String = js.native
    
    def value: js.Object = js.native
  }
  
  @js.native
  trait ListItemDescriptor extends StObject {
    
    var dateExpires: String = js.native
    
    var dateUpdated: Date = js.native
    
    var index: Double = js.native
    
    var lastEventId: Double = js.native
    
    var revision: String = js.native
    
    var uri: String = js.native
    
    var value: js.Object = js.native
  }
  object ListItemDescriptor {
    
    @scala.inline
    def apply(
      dateExpires: String,
      dateUpdated: Date,
      index: Double,
      lastEventId: Double,
      revision: String,
      uri: String,
      value: js.Object
    ): ListItemDescriptor = {
      val __obj = js.Dynamic.literal(dateExpires = dateExpires.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], lastEventId = lastEventId.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListItemDescriptor]
    }
    
    @scala.inline
    implicit class ListItemDescriptorMutableBuilder[Self <: ListItemDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDateExpires(value: String): Self = StObject.set(x, "dateExpires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUpdated(value: Date): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastEventId(value: Double): Self = StObject.set(x, "lastEventId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Object): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
