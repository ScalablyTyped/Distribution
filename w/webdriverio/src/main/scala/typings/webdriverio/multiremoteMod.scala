package typings.webdriverio

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.std.Record
import typings.webdriverio.anon.CommandList
import typings.webdriverio.webdriverioBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiremoteMod {
  
  @JSImport("webdriverio/build/multiremote", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with MultiRemote {
    
    /**
      * add instance to multibrowser instance
      */
    /* CompleteClass */
    override def addInstance(browserName: String, client: Any): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
      ] = js.native
    
    /**
      * handle commands for multiremote instances
      */
    /* CompleteClass */
    override def commandWrapper(
      commandName: /* keyof @wdio/protocols.@wdio/protocols.ProtocolCommands & webdriverio.webdriverio/build/types.BrowserCommandsType */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 269 */ Any
    ): js.Function1[/* args */ Any, js.Promise[Any]] = js.native
    
    /* CompleteClass */
    var instances: Record[
        String, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
      ] = js.native
    
    /**
      * modifier for multibrowser instance
      */
    /* CompleteClass */
    override def modifier(wrapperClient: CommandList): Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("webdriverio/build/multiremote", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * helper method to generate element objects from results, so that we can call, e.g.
      *
      * ```
      * const elem = $('#elem')
      * elem.getHTML()
      * ```
      *
      * or in case multiremote is used
      *
      * ```
      * const elems = $$('div')
      * elems[0].getHTML()
      * ```
      */
    inline def elementWrapper(
      instances: Record[
          String, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
        ],
      result: Any,
      propertiesObject: Record[String, js.PropertyDescriptor],
      scope: MultiRemote
    ): MultiRemoteElement = (^.asInstanceOf[js.Dynamic].applyDynamic("elementWrapper")(instances.asInstanceOf[js.Any], result.asInstanceOf[js.Any], propertiesObject.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[MultiRemoteElement]
  }
  
  @JSImport("webdriverio/build/multiremote", "MultiRemoteDriver")
  @js.native
  open class MultiRemoteDriver protected () extends StObject {
    def this(
      instances: Record[
            String, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
          ],
      propertiesObject: Record[String, js.PropertyDescriptor]
    ) = this()
    
    var __propertiesObject__ : Record[String, js.PropertyDescriptor] = js.native
    
    def emit(eventName: String, emitter: EventEmitter): Boolean = js.native
    
    def eventNames(): Any = js.native
    
    def getMaxListeners(): Double = js.native
    
    var instances: js.Array[String] = js.native
    
    var isMultiremote: `true` = js.native
    
    def listenerCount(eventName: String): Double = js.native
    
    def listeners(eventName: String): js.Array[js.Function] = js.native
    
    def on(eventName: String, emitter: EventEmitter): Any = js.native
    
    def once(eventName: String, emitter: EventEmitter): Any = js.native
    
    def removeAllListeners(eventName: String): Any = js.native
    
    def removeListener(eventName: String, emitter: EventEmitter): Any = js.native
  }
  
  type EventEmitter = js.Function1[/* args */ Any, Unit]
  
  trait MultiRemote extends StObject {
    
    /**
      * add instance to multibrowser instance
      */
    def addInstance(browserName: String, client: Any): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
      ]
    
    var baseInstance: js.UndefOr[MultiRemoteDriver] = js.undefined
    
    /**
      * handle commands for multiremote instances
      */
    def commandWrapper(
      commandName: /* keyof @wdio/protocols.@wdio/protocols.ProtocolCommands & webdriverio.webdriverio/build/types.BrowserCommandsType */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 269 */ Any
    ): js.Function1[/* args */ Any, js.Promise[Any]]
    
    var instances: Record[
        String, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
      ]
    
    /**
      * modifier for multibrowser instance
      */
    def modifier(wrapperClient: CommandList): Any
    
    var sessionId: js.UndefOr[String] = js.undefined
  }
  object MultiRemote {
    
    inline def apply(
      addInstance: (String, Any) => js.Promise[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
        ],
      commandWrapper: /* keyof @wdio/protocols.@wdio/protocols.ProtocolCommands & webdriverio.webdriverio/build/types.BrowserCommandsType */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 269 */ Any => js.Function1[/* args */ Any, js.Promise[Any]],
      instances: Record[
          String, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
        ],
      modifier: CommandList => Any
    ): MultiRemote = {
      val __obj = js.Dynamic.literal(addInstance = js.Any.fromFunction2(addInstance), commandWrapper = js.Any.fromFunction1(commandWrapper), instances = instances.asInstanceOf[js.Any], modifier = js.Any.fromFunction1(modifier))
      __obj.asInstanceOf[MultiRemote]
    }
    
    extension [Self <: MultiRemote](x: Self) {
      
      inline def setAddInstance(
        value: (String, Any) => js.Promise[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
            ]
      ): Self = StObject.set(x, "addInstance", js.Any.fromFunction2(value))
      
      inline def setBaseInstance(value: MultiRemoteDriver): Self = StObject.set(x, "baseInstance", value.asInstanceOf[js.Any])
      
      inline def setBaseInstanceUndefined: Self = StObject.set(x, "baseInstance", js.undefined)
      
      inline def setCommandWrapper(
        value: /* keyof @wdio/protocols.@wdio/protocols.ProtocolCommands & webdriverio.webdriverio/build/types.BrowserCommandsType */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 269 */ Any => js.Function1[/* args */ Any, js.Promise[Any]]
      ): Self = StObject.set(x, "commandWrapper", js.Any.fromFunction1(value))
      
      inline def setInstances(
        value: Record[
              String, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
            ]
      ): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
      
      inline def setModifier(value: CommandList => Any): Self = StObject.set(x, "modifier", js.Any.fromFunction1(value))
      
      inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
      
      inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    }
  }
  
  trait MultiRemoteElement
    extends StObject
       with /* instanceName */ StringDictionary[Element] {
    
    var __propertiesObject__ : Record[String, js.PropertyDescriptor]
    
    var instances: js.Array[String]
    
    var isMultiremote: Boolean
    
    var selector: String
  }
  object MultiRemoteElement {
    
    inline def apply(
      __propertiesObject__ : Record[String, js.PropertyDescriptor],
      instances: js.Array[String],
      isMultiremote: Boolean,
      selector: String
    ): MultiRemoteElement = {
      val __obj = js.Dynamic.literal(__propertiesObject__ = __propertiesObject__.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], isMultiremote = isMultiremote.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiRemoteElement]
    }
    
    extension [Self <: MultiRemoteElement](x: Self) {
      
      inline def setInstances(value: js.Array[String]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
      
      inline def setInstancesVarargs(value: String*): Self = StObject.set(x, "instances", js.Array(value*))
      
      inline def setIsMultiremote(value: Boolean): Self = StObject.set(x, "isMultiremote", value.asInstanceOf[js.Any])
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def set__propertiesObject__(value: Record[String, js.PropertyDescriptor]): Self = StObject.set(x, "__propertiesObject__", value.asInstanceOf[js.Any])
    }
  }
}
