package typings.traceparent

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("traceparent", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with TraceParent {
    def this(buffer: Buffer) = this()
    
    /* CompleteClass */
    override def child(): TraceParent = js.native
    
    /* CompleteClass */
    override def ensureParentId(): String = js.native
    
    /* CompleteClass */
    override val flags: String = js.native
    
    /* CompleteClass */
    override val id: String = js.native
    
    /* CompleteClass */
    override val recorded: Boolean = js.native
    
    /* CompleteClass */
    override val traceId: String = js.native
    
    /* CompleteClass */
    override val version: String = js.native
  }
  @JSImport("traceparent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  /* Inlined std.Readonly<{  recorded :0b00000001}> */
  object FLAGS {
    
    @JSImport("traceparent", "FLAGS.recorded")
    @js.native
    val recorded: /* 0b00000001 */ Double = js.native
  }
  
  /* static member */
  inline def fromString(header: String): TraceParent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(header.asInstanceOf[js.Any]).asInstanceOf[TraceParent]
  
  inline def startOrResume(parent: String, settings: TraceParentSettings): TraceParent = (^.asInstanceOf[js.Dynamic].applyDynamic("startOrResume")(parent.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[TraceParent]
  /* static member */
  inline def startOrResume(parent: Null, settings: TraceParentSettings): TraceParent = (^.asInstanceOf[js.Dynamic].applyDynamic("startOrResume")(parent.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[TraceParent]
  inline def startOrResume(parent: Unit, settings: TraceParentSettings): TraceParent = (^.asInstanceOf[js.Dynamic].applyDynamic("startOrResume")(parent.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[TraceParent]
  inline def startOrResume(parent: TraceParent, settings: TraceParentSettings): TraceParent = (^.asInstanceOf[js.Dynamic].applyDynamic("startOrResume")(parent.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[TraceParent]
  
  trait TraceParent extends StObject {
    
    def child(): TraceParent
    
    def ensureParentId(): String
    
    val flags: String
    
    val id: String
    
    val parentId: js.UndefOr[String] = js.undefined
    
    val recorded: Boolean
    
    val traceId: String
    
    val version: String
  }
  object TraceParent {
    
    inline def apply(
      child: () => TraceParent,
      ensureParentId: () => String,
      flags: String,
      id: String,
      recorded: Boolean,
      traceId: String,
      version: String
    ): TraceParent = {
      val __obj = js.Dynamic.literal(child = js.Any.fromFunction0(child), ensureParentId = js.Any.fromFunction0(ensureParentId), flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], recorded = recorded.asInstanceOf[js.Any], traceId = traceId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[TraceParent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TraceParent] (val x: Self) extends AnyVal {
      
      inline def setChild(value: () => TraceParent): Self = StObject.set(x, "child", js.Any.fromFunction0(value))
      
      inline def setEnsureParentId(value: () => String): Self = StObject.set(x, "ensureParentId", js.Any.fromFunction0(value))
      
      inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setRecorded(value: Boolean): Self = StObject.set(x, "recorded", value.asInstanceOf[js.Any])
      
      inline def setTraceId(value: String): Self = StObject.set(x, "traceId", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait TraceParentSettings extends StObject {
    
    var transactionSampleRate: Double
  }
  object TraceParentSettings {
    
    inline def apply(transactionSampleRate: Double): TraceParentSettings = {
      val __obj = js.Dynamic.literal(transactionSampleRate = transactionSampleRate.asInstanceOf[js.Any])
      __obj.asInstanceOf[TraceParentSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TraceParentSettings] (val x: Self) extends AnyVal {
      
      inline def setTransactionSampleRate(value: Double): Self = StObject.set(x, "transactionSampleRate", value.asInstanceOf[js.Any])
    }
  }
}
