package typings.whatwgUrl

import typings.whatwgUrl.mod.URLRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var doNotStripQMark: js.UndefOr[Boolean] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setDoNotStripQMark(value: Boolean): Self = StObject.set(x, "doNotStripQMark", value.asInstanceOf[js.Any])
      
      inline def setDoNotStripQMarkUndefined: Self = StObject.set(x, "doNotStripQMark", js.undefined)
    }
  }
  
  trait BaseURL extends StObject {
    
    val baseURL: js.UndefOr[String] = js.undefined
  }
  object BaseURL {
    
    inline def apply(): BaseURL = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseURL]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseURL] (val x: Self) extends AnyVal {
      
      inline def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
      
      inline def setBaseURLUndefined: Self = StObject.set(x, "baseURL", js.undefined)
    }
  }
  
  trait Context extends StObject {
    
    var context: String
  }
  object Context {
    
    inline def apply(context: String): Context = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    }
  }
  
  trait DoNotStripQMark extends StObject {
    
    val doNotStripQMark: js.UndefOr[Boolean] = js.undefined
  }
  object DoNotStripQMark {
    
    inline def apply(): DoNotStripQMark = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DoNotStripQMark]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DoNotStripQMark] (val x: Self) extends AnyVal {
      
      inline def setDoNotStripQMark(value: Boolean): Self = StObject.set(x, "doNotStripQMark", value.asInstanceOf[js.Any])
      
      inline def setDoNotStripQMarkUndefined: Self = StObject.set(x, "doNotStripQMark", js.undefined)
    }
  }
  
  trait StateOverride extends StObject {
    
    var baseURL: js.UndefOr[String] = js.undefined
    
    var stateOverride: js.UndefOr[typings.whatwgUrl.mod.StateOverride] = js.undefined
    
    var url: js.UndefOr[URLRecord] = js.undefined
  }
  object StateOverride {
    
    inline def apply(): StateOverride = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StateOverride]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StateOverride] (val x: Self) extends AnyVal {
      
      inline def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
      
      inline def setBaseURLUndefined: Self = StObject.set(x, "baseURL", js.undefined)
      
      inline def setStateOverride(value: typings.whatwgUrl.mod.StateOverride): Self = StObject.set(x, "stateOverride", value.asInstanceOf[js.Any])
      
      inline def setStateOverrideUndefined: Self = StObject.set(x, "stateOverride", js.undefined)
      
      inline def setUrl(value: URLRecord): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
