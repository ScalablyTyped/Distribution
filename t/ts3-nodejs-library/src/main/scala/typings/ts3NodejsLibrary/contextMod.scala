package typings.ts3NodejsLibrary

import typings.ts3NodejsLibrary.contextMod.SelectType.NONE
import typings.ts3NodejsLibrary.contextMod.SelectType.PORT
import typings.ts3NodejsLibrary.contextMod.SelectType.SID
import typings.ts3NodejsLibrary.ts3NodejsLibraryNumbers.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  @js.native
  sealed trait SelectType extends StObject
  @JSImport("ts3-nodejs-library/lib/types/context", "SelectType")
  @js.native
  object SelectType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SelectType & Double] = js.native
    
    @js.native
    sealed trait NONE
      extends StObject
         with SelectType
    /* 0 */ val NONE: typings.ts3NodejsLibrary.contextMod.SelectType.NONE & Double = js.native
    
    @js.native
    sealed trait PORT
      extends StObject
         with SelectType
    /* 2 */ val PORT: typings.ts3NodejsLibrary.contextMod.SelectType.PORT & Double = js.native
    
    @js.native
    sealed trait SID
      extends StObject
         with SelectType
    /* 1 */ val SID: typings.ts3NodejsLibrary.contextMod.SelectType.SID & Double = js.native
  }
  
  trait ActiveEvent extends StObject {
    
    var event: String
    
    var id: js.UndefOr[String] = js.undefined
  }
  object ActiveEvent {
    
    inline def apply(event: String): ActiveEvent = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActiveEvent]
    }
    
    extension [Self <: ActiveEvent](x: Self) {
      
      inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  trait BaseContext extends StObject {
    
    var clientNickname: js.UndefOr[String] = js.undefined
    
    var events: js.Array[ActiveEvent]
    
    var login: js.UndefOr[LoginInfo] = js.undefined
    
    var selectType: SelectType
  }
  object BaseContext {
    
    inline def apply(events: js.Array[ActiveEvent], selectType: SelectType): BaseContext = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], selectType = selectType.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseContext]
    }
    
    extension [Self <: BaseContext](x: Self) {
      
      inline def setClientNickname(value: String): Self = StObject.set(x, "clientNickname", value.asInstanceOf[js.Any])
      
      inline def setClientNicknameUndefined: Self = StObject.set(x, "clientNickname", js.undefined)
      
      inline def setEvents(value: js.Array[ActiveEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsVarargs(value: ActiveEvent*): Self = StObject.set(x, "events", js.Array(value :_*))
      
      inline def setLogin(value: LoginInfo): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
      
      inline def setLoginUndefined: Self = StObject.set(x, "login", js.undefined)
      
      inline def setSelectType(value: SelectType): Self = StObject.set(x, "selectType", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ts3NodejsLibrary.contextMod.SelectPortContext
    - typings.ts3NodejsLibrary.contextMod.SelectSidContext
    - typings.ts3NodejsLibrary.contextMod.SelectNoneContext
  */
  trait Context extends StObject
  object Context {
    
    inline def SelectNoneContext(events: js.Array[ActiveEvent], selectType: NONE): typings.ts3NodejsLibrary.contextMod.SelectNoneContext = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], selectType = selectType.asInstanceOf[js.Any], selected = 0)
      __obj.asInstanceOf[typings.ts3NodejsLibrary.contextMod.SelectNoneContext]
    }
    
    inline def SelectPortContext(events: js.Array[ActiveEvent], selectType: PORT, selected: Double): typings.ts3NodejsLibrary.contextMod.SelectPortContext = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], selectType = selectType.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ts3NodejsLibrary.contextMod.SelectPortContext]
    }
    
    inline def SelectSidContext(events: js.Array[ActiveEvent], selectType: SID, selected: String): typings.ts3NodejsLibrary.contextMod.SelectSidContext = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], selectType = selectType.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ts3NodejsLibrary.contextMod.SelectSidContext]
    }
  }
  
  trait LoginInfo extends StObject {
    
    var password: String
    
    var username: String
  }
  object LoginInfo {
    
    inline def apply(password: String, username: String): LoginInfo = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoginInfo]
    }
    
    extension [Self <: LoginInfo](x: Self) {
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelectNoneContext
    extends StObject
       with BaseContext
       with Context {
    
    @JSName("selectType")
    var selectType_SelectNoneContext: NONE
    
    var selected: `0`
  }
  object SelectNoneContext {
    
    inline def apply(events: js.Array[ActiveEvent], selectType: NONE): SelectNoneContext = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], selectType = selectType.asInstanceOf[js.Any], selected = 0)
      __obj.asInstanceOf[SelectNoneContext]
    }
    
    extension [Self <: SelectNoneContext](x: Self) {
      
      inline def setSelectType(value: NONE): Self = StObject.set(x, "selectType", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: `0`): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelectPortContext
    extends StObject
       with BaseContext
       with Context {
    
    @JSName("selectType")
    var selectType_SelectPortContext: PORT
    
    var selected: Double
  }
  object SelectPortContext {
    
    inline def apply(events: js.Array[ActiveEvent], selectType: PORT, selected: Double): SelectPortContext = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], selectType = selectType.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectPortContext]
    }
    
    extension [Self <: SelectPortContext](x: Self) {
      
      inline def setSelectType(value: PORT): Self = StObject.set(x, "selectType", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Double): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelectSidContext
    extends StObject
       with BaseContext
       with Context {
    
    @JSName("selectType")
    var selectType_SelectSidContext: SID
    
    var selected: String
  }
  object SelectSidContext {
    
    inline def apply(events: js.Array[ActiveEvent], selectType: SID, selected: String): SelectSidContext = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], selectType = selectType.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectSidContext]
    }
    
    extension [Self <: SelectSidContext](x: Self) {
      
      inline def setSelectType(value: SID): Self = StObject.set(x, "selectType", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
}
