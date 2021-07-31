package typings.yadda

import typings.std.Error
import typings.yadda.contextMod.Properties
import typings.yadda.libMod.Scenario
import typings.yadda.libMod.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object yaddaMod {
  
  @JSImport("yadda/lib/Yadda", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Yadda {
    def this(libraries: js.Array[typings.yadda.libraryMod.^]) = this()
    def this(libraries: typings.yadda.libraryMod.^) = this()
    def this(libraries: js.Array[typings.yadda.libraryMod.^], interpreter_context: Properties) = this()
    def this(libraries: js.Array[typings.yadda.libraryMod.^], interpreter_context: typings.yadda.contextMod.^) = this()
    def this(libraries: typings.yadda.libraryMod.^, interpreter_context: Properties) = this()
    def this(libraries: typings.yadda.libraryMod.^, interpreter_context: typings.yadda.contextMod.^) = this()
  }
  
  @js.native
  trait Yadda extends StObject {
    
    var interpreter: typings.yadda.interpreterMod.^ = js.native
    
    def run(scenario: js.Array[Scenario | Step]): Unit = js.native
    def run(scenario: js.Array[Scenario | Step], next: js.Function1[Error | Null, Unit]): Unit = js.native
    def run(scenario: js.Array[Scenario | Step], scenario_context: Properties): Unit = js.native
    def run(
      scenario: js.Array[Scenario | Step],
      scenario_context: Properties,
      next: js.Function1[Error | Null, Unit]
    ): Unit = js.native
    def run(scenario: js.Array[Scenario | Step], scenario_context: typings.yadda.contextMod.^): Unit = js.native
    def run(
      scenario: js.Array[Scenario | Step],
      scenario_context: typings.yadda.contextMod.^,
      next: js.Function1[Error | Null, Unit]
    ): Unit = js.native
    def run(scenario: Scenario): Unit = js.native
    def run(scenario: Scenario, next: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
    def run(scenario: Scenario, scenario_context: Properties): Unit = js.native
    def run(scenario: Scenario, scenario_context: Properties, next: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
    def run(scenario: Scenario, scenario_context: typings.yadda.contextMod.^): Unit = js.native
    def run(
      scenario: Scenario,
      scenario_context: typings.yadda.contextMod.^,
      next: js.Function1[/* err */ Error | Null, Unit]
    ): Unit = js.native
    def run(step: Step): Unit = js.native
    def run(step: Step, next: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
    def run(step: Step, scenario_context: Properties): Unit = js.native
    def run(step: Step, scenario_context: Properties, next: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
    def run(step: Step, scenario_context: typings.yadda.contextMod.^): Unit = js.native
    def run(
      step: Step,
      scenario_context: typings.yadda.contextMod.^,
      next: js.Function1[/* err */ Error | Null, Unit]
    ): Unit = js.native
    
    def yadda(scenario: js.Array[Scenario | Step]): Unit = js.native
    def yadda(scenario: js.Array[Scenario | Step], next: js.Function1[Error | Null, Unit]): Unit = js.native
    def yadda(scenario: js.Array[Scenario | Step], scenario_context: Properties): Unit = js.native
    def yadda(
      scenario: js.Array[Scenario | Step],
      scenario_context: Properties,
      next: js.Function1[Error | Null, Unit]
    ): Unit = js.native
    def yadda(scenario: js.Array[Scenario | Step], scenario_context: typings.yadda.contextMod.^): Unit = js.native
    def yadda(
      scenario: js.Array[Scenario | Step],
      scenario_context: typings.yadda.contextMod.^,
      next: js.Function1[Error | Null, Unit]
    ): Unit = js.native
    def yadda(scenario: Scenario): Unit = js.native
    def yadda(scenario: Scenario, next: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
    def yadda(scenario: Scenario, scenario_context: Properties): Unit = js.native
    def yadda(scenario: Scenario, scenario_context: Properties, next: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
    def yadda(scenario: Scenario, scenario_context: typings.yadda.contextMod.^): Unit = js.native
    def yadda(
      scenario: Scenario,
      scenario_context: typings.yadda.contextMod.^,
      next: js.Function1[/* err */ Error | Null, Unit]
    ): Unit = js.native
    def yadda(step: Step): Unit = js.native
    def yadda(step: Step, next: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
    def yadda(step: Step, scenario_context: Properties): Unit = js.native
    def yadda(step: Step, scenario_context: Properties, next: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
    def yadda(step: Step, scenario_context: typings.yadda.contextMod.^): Unit = js.native
    def yadda(
      step: Step,
      scenario_context: typings.yadda.contextMod.^,
      next: js.Function1[/* err */ Error | Null, Unit]
    ): Unit = js.native
  }
}
