package typings.yadda

import typings.yadda.libContextMod.Properties
import typings.yadda.yaddaStrings.__ON_DEFINE__
import typings.yadda.yaddaStrings.__ON_EXECUTE__
import typings.yadda.yaddaStrings.__ON_SCENARIO__
import typings.yadda.yaddaStrings.__ON_STEP__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEventBusMod {
  
  @JSImport("yadda/lib/EventBus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yadda/lib/EventBus", "EventBus")
  @js.native
  open class EventBus () extends StObject {
    
    def on(
      event_pattern: js.RegExp,
      callback: js.Function1[/* event */ ScenarioEvent | StepEvent | ExecuteEvent | DefineEvent, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_ONDEFINE(event_pattern: __ON_DEFINE__, callback: js.Function1[/* event */ DefineEvent, Unit]): this.type = js.native
    @JSName("on")
    def on_ONEXECUTE(event_pattern: __ON_EXECUTE__, callback: js.Function1[/* event */ ExecuteEvent, Unit]): this.type = js.native
    @JSName("on")
    def on_ONSCENARIO(event_pattern: __ON_SCENARIO__, callback: js.Function1[/* event */ ScenarioEvent, Unit]): this.type = js.native
    @JSName("on")
    def on_ONSTEP(event_pattern: __ON_STEP__, callback: js.Function1[/* event */ StepEvent, Unit]): this.type = js.native
    
    @JSName("send")
    def send_ONDEFINE(event_name: __ON_DEFINE__, event_data: DefineEvent): Unit = js.native
    @JSName("send")
    def send_ONDEFINE(
      event_name: __ON_DEFINE__,
      event_data: DefineEvent,
      next: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    @JSName("send")
    def send_ONEXECUTE(event_name: __ON_EXECUTE__, event_data: ExecuteEvent): Unit = js.native
    @JSName("send")
    def send_ONEXECUTE(
      event_name: __ON_EXECUTE__,
      event_data: ExecuteEvent,
      next: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    @JSName("send")
    def send_ONSCENARIO(event_name: __ON_SCENARIO__, event_data: ScenarioEventData): Unit = js.native
    @JSName("send")
    def send_ONSCENARIO(
      event_name: __ON_SCENARIO__,
      event_data: ScenarioEventData,
      next: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    @JSName("send")
    def send_ONSTEP(event_name: __ON_STEP__, event_data: StepEvent): Unit = js.native
    @JSName("send")
    def send_ONSTEP(
      event_name: __ON_STEP__,
      event_data: StepEvent,
      next: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
  }
  
  @JSImport("yadda/lib/EventBus", "ON_DEFINE")
  @js.native
  val ON_DEFINE: __ON_DEFINE__ = js.native
  
  @JSImport("yadda/lib/EventBus", "ON_EXECUTE")
  @js.native
  val ON_EXECUTE: __ON_EXECUTE__ = js.native
  
  @JSImport("yadda/lib/EventBus", "ON_SCENARIO")
  @js.native
  val ON_SCENARIO: __ON_SCENARIO__ = js.native
  
  @JSImport("yadda/lib/EventBus", "ON_STEP")
  @js.native
  val ON_STEP: __ON_STEP__ = js.native
  
  inline def instance(): EventBus = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")().asInstanceOf[EventBus]
  
  trait DefineEvent extends StObject {
    
    var data: DefineEventData
    
    var name: __ON_DEFINE__
  }
  object DefineEvent {
    
    inline def apply(data: DefineEventData): DefineEvent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = "__ON_DEFINE__")
      __obj.asInstanceOf[DefineEvent]
    }
    
    extension [Self <: DefineEvent](x: Self) {
      
      inline def setData(value: DefineEventData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setName(value: __ON_DEFINE__): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefineEventData extends StObject {
    
    var pattern: String
    
    var signature: String
  }
  object DefineEventData {
    
    inline def apply(pattern: String, signature: String): DefineEventData = {
      val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefineEventData]
    }
    
    extension [Self <: DefineEventData](x: Self) {
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExecuteEvent extends StObject {
    
    var data: ExecuteEventData
    
    var name: __ON_EXECUTE__
  }
  object ExecuteEvent {
    
    inline def apply(data: ExecuteEventData): ExecuteEvent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = "__ON_EXECUTE__")
      __obj.asInstanceOf[ExecuteEvent]
    }
    
    extension [Self <: ExecuteEvent](x: Self) {
      
      inline def setData(value: ExecuteEventData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setName(value: __ON_EXECUTE__): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExecuteEventData extends StObject {
    
    var args: js.Array[String]
    
    var ctx: Properties
    
    var pattern: String
    
    var step: String
  }
  object ExecuteEventData {
    
    inline def apply(args: js.Array[String], ctx: Properties, pattern: String, step: String): ExecuteEventData = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecuteEventData]
    }
    
    extension [Self <: ExecuteEventData](x: Self) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setCtx(value: Properties): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setStep(value: String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScenarioEvent extends StObject {
    
    var data: ScenarioEventData
    
    var name: __ON_SCENARIO__
  }
  object ScenarioEvent {
    
    inline def apply(data: ScenarioEventData): ScenarioEvent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = "__ON_SCENARIO__")
      __obj.asInstanceOf[ScenarioEvent]
    }
    
    extension [Self <: ScenarioEvent](x: Self) {
      
      inline def setData(value: ScenarioEventData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setName(value: __ON_SCENARIO__): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScenarioEventData extends StObject {
    
    var ctx: Properties
    
    var scenario: js.Array[String]
  }
  object ScenarioEventData {
    
    inline def apply(ctx: Properties, scenario: js.Array[String]): ScenarioEventData = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], scenario = scenario.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScenarioEventData]
    }
    
    extension [Self <: ScenarioEventData](x: Self) {
      
      inline def setCtx(value: Properties): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setScenario(value: js.Array[String]): Self = StObject.set(x, "scenario", value.asInstanceOf[js.Any])
      
      inline def setScenarioVarargs(value: String*): Self = StObject.set(x, "scenario", js.Array(value*))
    }
  }
  
  trait StepEvent extends StObject {
    
    var data: StepEventData
    
    var name: __ON_STEP__
  }
  object StepEvent {
    
    inline def apply(data: StepEventData): StepEvent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = "__ON_STEP__")
      __obj.asInstanceOf[StepEvent]
    }
    
    extension [Self <: StepEvent](x: Self) {
      
      inline def setData(value: StepEventData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setName(value: __ON_STEP__): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait StepEventData extends StObject {
    
    var ctx: Properties
    
    var step: String
  }
  object StepEventData {
    
    inline def apply(ctx: Properties, step: String): StepEventData = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepEventData]
    }
    
    extension [Self <: StepEventData](x: Self) {
      
      inline def setCtx(value: Properties): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setStep(value: String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    }
  }
}
