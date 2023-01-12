package typings.tizenAccessory

import typings.tizenAccessory.tizenAccessoryStrings.AVAILABLE
import typings.tizenAccessory.tizenAccessoryStrings.UNAVAILABLE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Oncomplete extends StObject {
    
    var oncomplete: js.UndefOr[js.Function2[/* id */ String, /* localPath */ String, Unit]] = js.undefined
    
    var onerror: js.UndefOr[js.Function2[/* errorCode */ String, /* id */ String, Unit]] = js.undefined
    
    var onprogress: js.UndefOr[js.Function2[/* id */ String, /* progress */ Double, Unit]] = js.undefined
  }
  object Oncomplete {
    
    inline def apply(): Oncomplete = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Oncomplete]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Oncomplete] (val x: Self) extends AnyVal {
      
      inline def setOncomplete(value: (/* id */ String, /* localPath */ String) => Unit): Self = StObject.set(x, "oncomplete", js.Any.fromFunction2(value))
      
      inline def setOncompleteUndefined: Self = StObject.set(x, "oncomplete", js.undefined)
      
      inline def setOnerror(value: (/* errorCode */ String, /* id */ String) => Unit): Self = StObject.set(x, "onerror", js.Any.fromFunction2(value))
      
      inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
      
      inline def setOnprogress(value: (/* id */ String, /* progress */ Double) => Unit): Self = StObject.set(x, "onprogress", js.Any.fromFunction2(value))
      
      inline def setOnprogressUndefined: Self = StObject.set(x, "onprogress", js.undefined)
    }
  }
  
  trait Onconnect extends StObject {
    
    var onconnect: js.UndefOr[js.Function1[/* socket */ SASocket, Unit]] = js.undefined
    
    var onerror: js.UndefOr[js.Function2[/* errorCode */ String, /* peerAgent */ SAPeerAgent, Unit]] = js.undefined
    
    var onrequest: js.UndefOr[js.Function1[/* peerAgent */ SAPeerAgent, Unit]] = js.undefined
  }
  object Onconnect {
    
    inline def apply(): Onconnect = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Onconnect]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Onconnect] (val x: Self) extends AnyVal {
      
      inline def setOnconnect(value: /* socket */ SASocket => Unit): Self = StObject.set(x, "onconnect", js.Any.fromFunction1(value))
      
      inline def setOnconnectUndefined: Self = StObject.set(x, "onconnect", js.undefined)
      
      inline def setOnerror(value: (/* errorCode */ String, /* peerAgent */ SAPeerAgent) => Unit): Self = StObject.set(x, "onerror", js.Any.fromFunction2(value))
      
      inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
      
      inline def setOnrequest(value: /* peerAgent */ SAPeerAgent => Unit): Self = StObject.set(x, "onrequest", js.Any.fromFunction1(value))
      
      inline def setOnrequestUndefined: Self = StObject.set(x, "onrequest", js.undefined)
    }
  }
  
  trait Onerror extends StObject {
    
    var onerror: js.UndefOr[js.Function1[/* errorCode */ String, Unit]] = js.undefined
    
    def onpeeragentfound(peerAgent: SAPeerAgent): Unit
    
    var onpeeragentupdated: js.UndefOr[
        js.Function2[/* peerAgent */ SAPeerAgent, /* status */ AVAILABLE | UNAVAILABLE, Unit]
      ] = js.undefined
  }
  object Onerror {
    
    inline def apply(onpeeragentfound: SAPeerAgent => Unit): Onerror = {
      val __obj = js.Dynamic.literal(onpeeragentfound = js.Any.fromFunction1(onpeeragentfound))
      __obj.asInstanceOf[Onerror]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Onerror] (val x: Self) extends AnyVal {
      
      inline def setOnerror(value: /* errorCode */ String => Unit): Self = StObject.set(x, "onerror", js.Any.fromFunction1(value))
      
      inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
      
      inline def setOnpeeragentfound(value: SAPeerAgent => Unit): Self = StObject.set(x, "onpeeragentfound", js.Any.fromFunction1(value))
      
      inline def setOnpeeragentupdated(value: (/* peerAgent */ SAPeerAgent, /* status */ AVAILABLE | UNAVAILABLE) => Unit): Self = StObject.set(x, "onpeeragentupdated", js.Any.fromFunction2(value))
      
      inline def setOnpeeragentupdatedUndefined: Self = StObject.set(x, "onpeeragentupdated", js.undefined)
    }
  }
  
  trait Onprogress extends StObject {
    
    var oncomplete: js.UndefOr[js.Function2[/* id */ String, /* localPath */ String, Unit]] = js.undefined
    
    var onerror: js.UndefOr[js.Function2[/* errorCode */ String, /* id */ String, Unit]] = js.undefined
    
    var onprogress: js.UndefOr[js.Function2[/* id */ String, /* progress */ Double, Unit]] = js.undefined
    
    var onreceive: js.UndefOr[js.Function2[/* id */ String, /* fileName */ String, Unit]] = js.undefined
  }
  object Onprogress {
    
    inline def apply(): Onprogress = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Onprogress]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Onprogress] (val x: Self) extends AnyVal {
      
      inline def setOncomplete(value: (/* id */ String, /* localPath */ String) => Unit): Self = StObject.set(x, "oncomplete", js.Any.fromFunction2(value))
      
      inline def setOncompleteUndefined: Self = StObject.set(x, "oncomplete", js.undefined)
      
      inline def setOnerror(value: (/* errorCode */ String, /* id */ String) => Unit): Self = StObject.set(x, "onerror", js.Any.fromFunction2(value))
      
      inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
      
      inline def setOnprogress(value: (/* id */ String, /* progress */ Double) => Unit): Self = StObject.set(x, "onprogress", js.Any.fromFunction2(value))
      
      inline def setOnprogressUndefined: Self = StObject.set(x, "onprogress", js.undefined)
      
      inline def setOnreceive(value: (/* id */ String, /* fileName */ String) => Unit): Self = StObject.set(x, "onreceive", js.Any.fromFunction2(value))
      
      inline def setOnreceiveUndefined: Self = StObject.set(x, "onreceive", js.undefined)
    }
  }
  
  trait Onsent extends StObject {
    
    var onerror: js.UndefOr[
        js.Function3[/* errorCode */ String, /* peerAgent */ SAPeerAgent, /* id */ String, Unit]
      ] = js.undefined
    
    var onsent: js.UndefOr[js.Function2[/* peerAgent */ SAPeerAgent, /* id */ String, Unit]] = js.undefined
  }
  object Onsent {
    
    inline def apply(): Onsent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Onsent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Onsent] (val x: Self) extends AnyVal {
      
      inline def setOnerror(value: (/* errorCode */ String, /* peerAgent */ SAPeerAgent, /* id */ String) => Unit): Self = StObject.set(x, "onerror", js.Any.fromFunction3(value))
      
      inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
      
      inline def setOnsent(value: (/* peerAgent */ SAPeerAgent, /* id */ String) => Unit): Self = StObject.set(x, "onsent", js.Any.fromFunction2(value))
      
      inline def setOnsentUndefined: Self = StObject.set(x, "onsent", js.undefined)
    }
  }
}
