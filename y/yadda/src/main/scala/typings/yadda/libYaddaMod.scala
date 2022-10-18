package typings.yadda

import typings.yadda.libContextMod.Properties
import typings.yadda.libMod.Scenario
import typings.yadda.libMod.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libYaddaMod {
  
  @JSImport("yadda/lib/Yadda", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Yadda {
    def this(libraries: js.Array[typings.yadda.libLibraryMod.^]) = this()
    def this(libraries: typings.yadda.libLibraryMod.^) = this()
    def this(libraries: js.Array[typings.yadda.libLibraryMod.^], interpreter_context: Properties) = this()
    def this(
      libraries: js.Array[typings.yadda.libLibraryMod.^],
      interpreter_context: typings.yadda.libContextMod.^
    ) = this()
    def this(libraries: typings.yadda.libLibraryMod.^, interpreter_context: Properties) = this()
    def this(libraries: typings.yadda.libLibraryMod.^, interpreter_context: typings.yadda.libContextMod.^) = this()
  }
  
  @js.native
  trait Yadda extends StObject {
    
    var interpreter: typings.yadda.libInterpreterMod.^ = js.native
    
    def run(scenario: js.Array[Scenario | Step]): Unit = js.native
    def run(scenario: js.Array[Scenario | Step], next: js.Function1[js.Error | Null, Unit]): Unit = js.native
    def run(scenario: js.Array[Scenario | Step], scenario_context: Properties): Unit = js.native
    def run(
      scenario: js.Array[Scenario | Step],
      scenario_context: Properties,
      next: js.Function1[js.Error | Null, Unit]
    ): Unit = js.native
    def run(scenario: js.Array[Scenario | Step], scenario_context: typings.yadda.libContextMod.^): Unit = js.native
    def run(
      scenario: js.Array[Scenario | Step],
      scenario_context: typings.yadda.libContextMod.^,
      next: js.Function1[js.Error | Null, Unit]
    ): Unit = js.native
    def run(scenario: Scenario): Unit = js.native
    def run(scenario: Scenario, next: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
    def run(scenario: Scenario, scenario_context: Properties): Unit = js.native
    def run(
      scenario: Scenario,
      scenario_context: Properties,
      next: js.Function1[/* err */ js.Error | Null, Unit]
    ): Unit = js.native
    def run(scenario: Scenario, scenario_context: typings.yadda.libContextMod.^): Unit = js.native
    def run(
      scenario: Scenario,
      scenario_context: typings.yadda.libContextMod.^,
      next: js.Function1[/* err */ js.Error | Null, Unit]
    ): Unit = js.native
    def run(step: Step): Unit = js.native
    def run(step: Step, next: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
    def run(step: Step, scenario_context: Properties): Unit = js.native
    def run(step: Step, scenario_context: Properties, next: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
    def run(step: Step, scenario_context: typings.yadda.libContextMod.^): Unit = js.native
    def run(
      step: Step,
      scenario_context: typings.yadda.libContextMod.^,
      next: js.Function1[/* err */ js.Error | Null, Unit]
    ): Unit = js.native
    
    def yadda(scenario: js.Array[Scenario | Step]): Unit = js.native
    def yadda(scenario: js.Array[Scenario | Step], next: js.Function1[js.Error | Null, Unit]): Unit = js.native
    def yadda(scenario: js.Array[Scenario | Step], scenario_context: Properties): Unit = js.native
    def yadda(
      scenario: js.Array[Scenario | Step],
      scenario_context: Properties,
      next: js.Function1[js.Error | Null, Unit]
    ): Unit = js.native
    def yadda(scenario: js.Array[Scenario | Step], scenario_context: typings.yadda.libContextMod.^): Unit = js.native
    def yadda(
      scenario: js.Array[Scenario | Step],
      scenario_context: typings.yadda.libContextMod.^,
      next: js.Function1[js.Error | Null, Unit]
    ): Unit = js.native
    def yadda(scenario: Scenario): Unit = js.native
    def yadda(scenario: Scenario, next: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
    def yadda(scenario: Scenario, scenario_context: Properties): Unit = js.native
    def yadda(
      scenario: Scenario,
      scenario_context: Properties,
      next: js.Function1[/* err */ js.Error | Null, Unit]
    ): Unit = js.native
    def yadda(scenario: Scenario, scenario_context: typings.yadda.libContextMod.^): Unit = js.native
    def yadda(
      scenario: Scenario,
      scenario_context: typings.yadda.libContextMod.^,
      next: js.Function1[/* err */ js.Error | Null, Unit]
    ): Unit = js.native
    def yadda(step: Step): Unit = js.native
    def yadda(step: Step, next: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
    def yadda(step: Step, scenario_context: Properties): Unit = js.native
    def yadda(step: Step, scenario_context: Properties, next: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
    def yadda(step: Step, scenario_context: typings.yadda.libContextMod.^): Unit = js.native
    def yadda(
      step: Step,
      scenario_context: typings.yadda.libContextMod.^,
      next: js.Function1[/* err */ js.Error | Null, Unit]
    ): Unit = js.native
  }
}
