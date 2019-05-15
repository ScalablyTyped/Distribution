package typings
package yaddaLib.libYaddaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Yadda extends js.Object {
  var interpreter: yaddaLib.libInterpreterMod.^ = js.native
  def run(scenario: js.Array[yaddaLib.libMod.Scenario | yaddaLib.libMod.Step]): scala.Unit = js.native
  def run(
    scenario: js.Array[yaddaLib.libMod.Scenario | yaddaLib.libMod.Step],
    next: js.Function1[stdLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def run(
    scenario: js.Array[yaddaLib.libMod.Scenario | yaddaLib.libMod.Step],
    scenarioContext: yaddaLib.libContextMod.^
  ): scala.Unit = js.native
  def run(
    scenario: js.Array[yaddaLib.libMod.Scenario | yaddaLib.libMod.Step],
    scenarioContext: yaddaLib.libContextMod.^,
    next: js.Function1[stdLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def run(scenario: yaddaLib.libMod.Scenario): scala.Unit = js.native
  def run(
    scenario: yaddaLib.libMod.Scenario,
    next: js.Function1[/* err */ stdLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def run(scenario: yaddaLib.libMod.Scenario, scenarioContext: yaddaLib.libContextMod.^): scala.Unit = js.native
  def run(
    scenario: yaddaLib.libMod.Scenario,
    scenarioContext: yaddaLib.libContextMod.^,
    next: js.Function1[/* err */ stdLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def run(step: yaddaLib.libMod.Step): scala.Unit = js.native
  def run(step: yaddaLib.libMod.Step, next: js.Function1[/* err */ stdLib.Error | scala.Null, scala.Unit]): scala.Unit = js.native
  def run(step: yaddaLib.libMod.Step, scenarioContext: yaddaLib.libContextMod.^): scala.Unit = js.native
  def run(
    step: yaddaLib.libMod.Step,
    scenarioContext: yaddaLib.libContextMod.^,
    next: js.Function1[/* err */ stdLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def yadda(scenario: js.Array[yaddaLib.libMod.Scenario | yaddaLib.libMod.Step]): scala.Unit = js.native
  def yadda(
    scenario: js.Array[yaddaLib.libMod.Scenario | yaddaLib.libMod.Step],
    next: js.Function1[stdLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def yadda(
    scenario: js.Array[yaddaLib.libMod.Scenario | yaddaLib.libMod.Step],
    scenarioContext: yaddaLib.libContextMod.^
  ): scala.Unit = js.native
  def yadda(
    scenario: js.Array[yaddaLib.libMod.Scenario | yaddaLib.libMod.Step],
    scenarioContext: yaddaLib.libContextMod.^,
    next: js.Function1[stdLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def yadda(scenario: yaddaLib.libMod.Scenario): scala.Unit = js.native
  def yadda(
    scenario: yaddaLib.libMod.Scenario,
    next: js.Function1[/* err */ stdLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def yadda(scenario: yaddaLib.libMod.Scenario, scenarioContext: yaddaLib.libContextMod.^): scala.Unit = js.native
  def yadda(
    scenario: yaddaLib.libMod.Scenario,
    scenarioContext: yaddaLib.libContextMod.^,
    next: js.Function1[/* err */ stdLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def yadda(step: yaddaLib.libMod.Step): scala.Unit = js.native
  def yadda(step: yaddaLib.libMod.Step, next: js.Function1[/* err */ stdLib.Error | scala.Null, scala.Unit]): scala.Unit = js.native
  def yadda(step: yaddaLib.libMod.Step, scenarioContext: yaddaLib.libContextMod.^): scala.Unit = js.native
  def yadda(
    step: yaddaLib.libMod.Step,
    scenarioContext: yaddaLib.libContextMod.^,
    next: js.Function1[/* err */ stdLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
}

