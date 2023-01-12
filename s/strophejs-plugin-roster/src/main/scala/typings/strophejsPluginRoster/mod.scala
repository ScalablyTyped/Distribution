package typings.strophejsPluginRoster

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.strophejsPluginRoster.strophejsPluginRosterBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type IqCallback = js.Function1[/* stanza */ Element, Any]
  
  type IqID = String
  
  type PresenceRequestCallback = js.Function1[/* from */ String, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.strophejsPluginRoster.strophejsPluginRosterStrings.subscribe
    - typings.strophejsPluginRoster.strophejsPluginRosterStrings.unsubscribe
    - typings.strophejsPluginRoster.strophejsPluginRosterStrings.subscribed
    - typings.strophejsPluginRoster.strophejsPluginRosterStrings.unsubscribed
  */
  trait PresenceSubscriptionType extends StObject
  object PresenceSubscriptionType {
    
    inline def subscribe: typings.strophejsPluginRoster.strophejsPluginRosterStrings.subscribe = "subscribe".asInstanceOf[typings.strophejsPluginRoster.strophejsPluginRosterStrings.subscribe]
    
    inline def subscribed: typings.strophejsPluginRoster.strophejsPluginRosterStrings.subscribed = "subscribed".asInstanceOf[typings.strophejsPluginRoster.strophejsPluginRosterStrings.subscribed]
    
    inline def unsubscribe: typings.strophejsPluginRoster.strophejsPluginRosterStrings.unsubscribe = "unsubscribe".asInstanceOf[typings.strophejsPluginRoster.strophejsPluginRosterStrings.unsubscribe]
    
    inline def unsubscribed: typings.strophejsPluginRoster.strophejsPluginRosterStrings.unsubscribed = "unsubscribed".asInstanceOf[typings.strophejsPluginRoster.strophejsPluginRosterStrings.unsubscribed]
  }
  
  trait RosterItem extends StObject {
    
    var ask: String
    
    var groups: js.Array[String]
    
    var jid: String
    
    var name: String
    
    var resources: StringDictionary[RosterResource]
    
    var subscription: RosterSubscriptionState
  }
  object RosterItem {
    
    inline def apply(
      ask: String,
      groups: js.Array[String],
      jid: String,
      name: String,
      resources: StringDictionary[RosterResource],
      subscription: RosterSubscriptionState
    ): RosterItem = {
      val __obj = js.Dynamic.literal(ask = ask.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], jid = jid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any])
      __obj.asInstanceOf[RosterItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RosterItem] (val x: Self) extends AnyVal {
      
      inline def setAsk(value: String): Self = StObject.set(x, "ask", value.asInstanceOf[js.Any])
      
      inline def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value*))
      
      inline def setJid(value: String): Self = StObject.set(x, "jid", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setResources(value: StringDictionary[RosterResource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setSubscription(value: RosterSubscriptionState): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    }
  }
  
  trait RosterResource extends StObject {
    
    var priority: String
    
    var show: String
    
    var status: String
  }
  object RosterResource {
    
    inline def apply(priority: String, show: String, status: String): RosterResource = {
      val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[RosterResource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RosterResource] (val x: Self) extends AnyVal {
      
      inline def setPriority(value: String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setShow(value: String): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.strophejsPluginRoster.strophejsPluginRosterStrings.none
    - typings.strophejsPluginRoster.strophejsPluginRosterStrings.to
    - typings.strophejsPluginRoster.strophejsPluginRosterStrings.from
    - typings.strophejsPluginRoster.strophejsPluginRosterStrings.both
    - typings.strophejsPluginRoster.strophejsPluginRosterStrings.remove
  */
  trait RosterSubscriptionState extends StObject
  object RosterSubscriptionState {
    
    inline def both: typings.strophejsPluginRoster.strophejsPluginRosterStrings.both = "both".asInstanceOf[typings.strophejsPluginRoster.strophejsPluginRosterStrings.both]
    
    inline def from: typings.strophejsPluginRoster.strophejsPluginRosterStrings.from = "from".asInstanceOf[typings.strophejsPluginRoster.strophejsPluginRosterStrings.from]
    
    inline def none: typings.strophejsPluginRoster.strophejsPluginRosterStrings.none = "none".asInstanceOf[typings.strophejsPluginRoster.strophejsPluginRosterStrings.none]
    
    inline def remove: typings.strophejsPluginRoster.strophejsPluginRosterStrings.remove = "remove".asInstanceOf[typings.strophejsPluginRoster.strophejsPluginRosterStrings.remove]
    
    inline def to: typings.strophejsPluginRoster.strophejsPluginRosterStrings.to = "to".asInstanceOf[typings.strophejsPluginRoster.strophejsPluginRosterStrings.to]
  }
  
  type RosterUpdateCallback = js.Function3[
    /* items */ js.Array[RosterItem], 
    /* item */ RosterItem, 
    /* previousItem */ RosterItem, 
    Any
  ]
  
  @js.native
  trait StropheRosterPlugin extends StObject {
    
    def add(jid: String, name: String, groups: js.Array[String]): IqID = js.native
    def add(jid: String, name: String, groups: js.Array[String], call_back: IqCallback): IqID = js.native
    
    def authorize(jid: String): Unit = js.native
    def authorize(jid: String, message: String): Unit = js.native
    
    def findItem(jid: String): RosterItem | `false` = js.native
    
    def get(userCallback: IqCallback): IqID = js.native
    def get(userCallback: IqCallback, ver: String): IqID = js.native
    def get(userCallback: IqCallback, ver: String, items: js.Array[String]): IqID = js.native
    def get(userCallback: IqCallback, ver: Unit, items: js.Array[String]): IqID = js.native
    
    def registerCallback(callback: RosterUpdateCallback): Unit = js.native
    
    def registerRequestCallback(callback: PresenceRequestCallback): Unit = js.native
    
    def remove(jid: String): Unit = js.native
    def remove(jid: String, call_back: IqCallback): Unit = js.native
    
    def removeItem(jid: String): Boolean = js.native
    
    def subscribe(jid: String): Unit = js.native
    def subscribe(jid: String, message: String): Unit = js.native
    def subscribe(jid: String, message: String, nick: String): Unit = js.native
    def subscribe(jid: String, message: Unit, nick: String): Unit = js.native
    
    def supportVersioning(): Boolean = js.native
    
    def unauthorize(jid: String): Unit = js.native
    def unauthorize(jid: String, message: String): Unit = js.native
    
    def unsubscribe(jid: String): Unit = js.native
    def unsubscribe(jid: String, message: String): Unit = js.native
    
    def update(jid: String): IqID = js.native
    def update(jid: String, name: String): IqID = js.native
    def update(jid: String, name: String, groups: js.Array[String]): IqID = js.native
    def update(jid: String, name: String, groups: js.Array[String], call_back: IqCallback): IqID = js.native
    def update(jid: String, name: String, groups: Unit, call_back: IqCallback): IqID = js.native
    def update(jid: String, name: Unit, groups: js.Array[String]): IqID = js.native
    def update(jid: String, name: Unit, groups: js.Array[String], call_back: IqCallback): IqID = js.native
    def update(jid: String, name: Unit, groups: Unit, call_back: IqCallback): IqID = js.native
  }
  
  object global {
    
    object Strophe {
      
      trait Connection extends StObject {
        
        var roster: StropheRosterPlugin
      }
      object Connection {
        
        inline def apply(roster: StropheRosterPlugin): Connection = {
          val __obj = js.Dynamic.literal(roster = roster.asInstanceOf[js.Any])
          __obj.asInstanceOf[Connection]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
          
          inline def setRoster(value: StropheRosterPlugin): Self = StObject.set(x, "roster", value.asInstanceOf[js.Any])
        }
      }
    }
  }
  
  /*~ Here, declare the same module as the one you imported above */
  /* augmented module */
  object stropheAugmentingMod {
    
    object Strophe {
      
      trait Connection extends StObject {
        
        var roster: StropheRosterPlugin
      }
      object Connection {
        
        inline def apply(roster: StropheRosterPlugin): Connection = {
          val __obj = js.Dynamic.literal(roster = roster.asInstanceOf[js.Any])
          __obj.asInstanceOf[Connection]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
          
          inline def setRoster(value: StropheRosterPlugin): Self = StObject.set(x, "roster", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
