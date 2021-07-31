package typings.webdriverio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiremoteMod {
  
  @JSImport("webdriverio/build/multiremote", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with MultiRemote {
    
    /* CompleteClass */
    override def addInstance(browserName: js.Any, client: js.Any): js.Promise[js.Any] = js.native
    
    /* CompleteClass */
    override def commandWrapper(commandName: js.Any): js.Function1[/* args */ js.Any, js.Promise[js.Any]] = js.native
    
    /* CompleteClass */
    override def modifier(wrapperClient: js.Any): js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("webdriverio/build/multiremote", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def elementWrapper(instances: js.Any, result: js.Any, propertiesObject: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("elementWrapper")(instances.asInstanceOf[js.Any], result.asInstanceOf[js.Any], propertiesObject.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
  
  trait MultiRemote extends StObject {
    
    def addInstance(browserName: js.Any, client: js.Any): js.Promise[js.Any]
    
    var baseInstance: js.UndefOr[MultiRemoteDriver] = js.undefined
    
    def commandWrapper(commandName: js.Any): js.Function1[/* args */ js.Any, js.Promise[js.Any]]
    
    def modifier(wrapperClient: js.Any): js.Any
  }
  object MultiRemote {
    
    @scala.inline
    def apply(
      addInstance: (js.Any, js.Any) => js.Promise[js.Any],
      commandWrapper: js.Any => js.Function1[/* args */ js.Any, js.Promise[js.Any]],
      modifier: js.Any => js.Any
    ): MultiRemote = {
      val __obj = js.Dynamic.literal(addInstance = js.Any.fromFunction2(addInstance), commandWrapper = js.Any.fromFunction1(commandWrapper), modifier = js.Any.fromFunction1(modifier))
      __obj.asInstanceOf[MultiRemote]
    }
    
    @scala.inline
    implicit class MultiRemoteMutableBuilder[Self <: MultiRemote] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddInstance(value: (js.Any, js.Any) => js.Promise[js.Any]): Self = StObject.set(x, "addInstance", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBaseInstance(value: MultiRemoteDriver): Self = StObject.set(x, "baseInstance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseInstanceUndefined: Self = StObject.set(x, "baseInstance", js.undefined)
      
      @scala.inline
      def setCommandWrapper(value: js.Any => js.Function1[/* args */ js.Any, js.Promise[js.Any]]): Self = StObject.set(x, "commandWrapper", js.Any.fromFunction1(value))
      
      @scala.inline
      def setModifier(value: js.Any => js.Any): Self = StObject.set(x, "modifier", js.Any.fromFunction1(value))
    }
  }
  
  trait MultiRemoteDriver extends StObject {
    
    var __propertiesObject__ : js.Any
    
    def emit(args: js.Any*): Unit
    
    def eventNames(args: js.Any*): Unit
    
    def getMaxListeners(): Unit
    
    var instances: js.Array[String]
    
    var isMultiremote: Boolean
    
    def listenerCount(args: js.Any*): Unit
    
    def listeners(args: js.Any*): Unit
    
    def on(args: js.Any*): Unit
    
    def once(args: js.Any*): Unit
    
    def removeAllListeners(args: js.Any*): Unit
    
    def removeListener(args: js.Any*): Unit
  }
  object MultiRemoteDriver {
    
    @scala.inline
    def apply(
      __propertiesObject__ : js.Any,
      emit: /* repeated */ js.Any => Unit,
      eventNames: /* repeated */ js.Any => Unit,
      getMaxListeners: () => Unit,
      instances: js.Array[String],
      isMultiremote: Boolean,
      listenerCount: /* repeated */ js.Any => Unit,
      listeners: /* repeated */ js.Any => Unit,
      on: /* repeated */ js.Any => Unit,
      once: /* repeated */ js.Any => Unit,
      removeAllListeners: /* repeated */ js.Any => Unit,
      removeListener: /* repeated */ js.Any => Unit
    ): MultiRemoteDriver = {
      val __obj = js.Dynamic.literal(__propertiesObject__ = __propertiesObject__.asInstanceOf[js.Any], emit = js.Any.fromFunction1(emit), eventNames = js.Any.fromFunction1(eventNames), getMaxListeners = js.Any.fromFunction0(getMaxListeners), instances = instances.asInstanceOf[js.Any], isMultiremote = isMultiremote.asInstanceOf[js.Any], listenerCount = js.Any.fromFunction1(listenerCount), listeners = js.Any.fromFunction1(listeners), on = js.Any.fromFunction1(on), once = js.Any.fromFunction1(once), removeAllListeners = js.Any.fromFunction1(removeAllListeners), removeListener = js.Any.fromFunction1(removeListener))
      __obj.asInstanceOf[MultiRemoteDriver]
    }
    
    @scala.inline
    implicit class MultiRemoteDriverMutableBuilder[Self <: MultiRemoteDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmit(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEventNames(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "eventNames", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetMaxListeners(value: () => Unit): Self = StObject.set(x, "getMaxListeners", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInstances(value: js.Array[String]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstancesVarargs(value: String*): Self = StObject.set(x, "instances", js.Array(value :_*))
      
      @scala.inline
      def setIsMultiremote(value: Boolean): Self = StObject.set(x, "isMultiremote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListenerCount(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "listenerCount", js.Any.fromFunction1(value))
      
      @scala.inline
      def setListeners(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "listeners", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOn(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "on", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnce(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "once", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveAllListeners(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "removeAllListeners", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveListener(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction1(value))
      
      @scala.inline
      def set__propertiesObject__(value: js.Any): Self = StObject.set(x, "__propertiesObject__", value.asInstanceOf[js.Any])
    }
  }
}
