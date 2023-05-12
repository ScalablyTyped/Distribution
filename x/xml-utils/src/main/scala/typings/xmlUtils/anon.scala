package typings.xmlUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    }
  }
  
  trait Debug extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var nested: js.UndefOr[Boolean] = js.undefined
    
    var startIndex: js.UndefOr[Double] = js.undefined
  }
  object Debug {
    
    inline def apply(): Debug = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Debug]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Debug] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setNested(value: Boolean): Self = StObject.set(x, "nested", value.asInstanceOf[js.Any])
      
      inline def setNestedUndefined: Self = StObject.set(x, "nested", js.undefined)
      
      inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
      
      inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    }
  }
  
  trait Nested extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var nested: js.UndefOr[Boolean] = js.undefined
    
    var startIndex: js.UndefOr[Boolean] = js.undefined
  }
  object Nested {
    
    inline def apply(): Nested = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Nested]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Nested] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setNested(value: Boolean): Self = StObject.set(x, "nested", value.asInstanceOf[js.Any])
      
      inline def setNestedUndefined: Self = StObject.set(x, "nested", js.undefined)
      
      inline def setStartIndex(value: Boolean): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
      
      inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    }
  }
  
  trait ReturnOnFirst extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var returnOnFirst: js.UndefOr[Boolean] = js.undefined
  }
  object ReturnOnFirst {
    
    inline def apply(): ReturnOnFirst = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReturnOnFirst]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReturnOnFirst] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setReturnOnFirst(value: Boolean): Self = StObject.set(x, "returnOnFirst", value.asInstanceOf[js.Any])
      
      inline def setReturnOnFirstUndefined: Self = StObject.set(x, "returnOnFirst", js.undefined)
    }
  }
}
