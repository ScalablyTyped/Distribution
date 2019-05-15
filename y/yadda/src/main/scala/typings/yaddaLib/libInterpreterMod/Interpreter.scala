package typings
package yaddaLib.libInterpreterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Interpreter extends js.Object {
  def interpret(scenario: js.Array[yaddaLib.libMod.Scenario], scenario_context: yaddaLib.libContextMod.^): scala.Unit = js.native
  def interpret(
    scenario: js.Array[yaddaLib.libMod.Scenario],
    scenario_context: yaddaLib.libContextMod.^,
    next: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* result */ js.UndefOr[yaddaLib.libMod.Scenario], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def interpret(scenario: yaddaLib.libMod.Scenario, scenario_context: yaddaLib.libContextMod.^): scala.Unit = js.native
  def interpret(
    scenario: yaddaLib.libMod.Scenario,
    scenario_context: yaddaLib.libContextMod.^,
    next: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* result */ js.UndefOr[yaddaLib.libMod.Scenario], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def interpret_step(step: js.Array[yaddaLib.libMod.Step], scenario_context: yaddaLib.libContextMod.^): scala.Unit = js.native
  def interpret_step(
    step: js.Array[yaddaLib.libMod.Step],
    scenario_context: yaddaLib.libContextMod.^,
    next: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* result */ js.UndefOr[yaddaLib.libMod.Step], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def interpret_step(step: yaddaLib.libMod.Step, scenario_context: yaddaLib.libContextMod.^): scala.Unit = js.native
  def interpret_step(
    step: yaddaLib.libMod.Step,
    scenario_context: yaddaLib.libContextMod.^,
    next: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* result */ js.UndefOr[yaddaLib.libMod.Step], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def requires(libs: js.Array[yaddaLib.libLibraryMod.^]): this.type = js.native
  def requires(libs: yaddaLib.libLibraryMod.^): this.type = js.native
  def validate(scenario: yaddaLib.libMod.Scenario): scala.Unit = js.native
}

