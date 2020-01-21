package typings.yadda.eventBusMod

import typings.std.Error
import typings.std.RegExp
import typings.yadda.yaddaStrings.__ON_DEFINE__
import typings.yadda.yaddaStrings.__ON_EXECUTE__
import typings.yadda.yaddaStrings.__ON_SCENARIO__
import typings.yadda.yaddaStrings.__ON_STEP__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda/lib/EventBus", "EventBus")
@js.native
class EventBus () extends js.Object {
  def on(
    event_pattern: RegExp,
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
    next: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  @JSName("send")
  def send_ONEXECUTE(event_name: __ON_EXECUTE__, event_data: ExecuteEvent): Unit = js.native
  @JSName("send")
  def send_ONEXECUTE(
    event_name: __ON_EXECUTE__,
    event_data: ExecuteEvent,
    next: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  @JSName("send")
  def send_ONSCENARIO(event_name: __ON_SCENARIO__, event_data: ScenarioEventData): Unit = js.native
  @JSName("send")
  def send_ONSCENARIO(
    event_name: __ON_SCENARIO__,
    event_data: ScenarioEventData,
    next: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  @JSName("send")
  def send_ONSTEP(event_name: __ON_STEP__, event_data: StepEvent): Unit = js.native
  @JSName("send")
  def send_ONSTEP(
    event_name: __ON_STEP__,
    event_data: StepEvent,
    next: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
}

