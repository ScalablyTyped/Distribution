package typings.yadda

import typings.yadda.libMod.Scenario
import typings.yadda.libMod.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInterpreterMod {
  
  @JSImport("yadda/lib/Interpreter", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Interpreter {
    def this(libraries: js.Array[typings.yadda.libLibraryMod.^]) = this()
    def this(libraries: typings.yadda.libLibraryMod.^) = this()
  }
  
  @js.native
  trait Interpreter extends StObject {
    
    def interpret(scenario: js.Array[Scenario], scenario_context: typings.yadda.libContextMod.^): Unit = js.native
    def interpret(
      scenario: js.Array[Scenario],
      scenario_context: typings.yadda.libContextMod.^,
      next: js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[Scenario], Unit]
    ): Unit = js.native
    def interpret(scenario: Scenario, scenario_context: typings.yadda.libContextMod.^): Unit = js.native
    def interpret(
      scenario: Scenario,
      scenario_context: typings.yadda.libContextMod.^,
      next: js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[Scenario], Unit]
    ): Unit = js.native
    
    def interpret_step(step: js.Array[Step], scenario_context: typings.yadda.libContextMod.^): Unit = js.native
    def interpret_step(
      step: js.Array[Step],
      scenario_context: typings.yadda.libContextMod.^,
      next: js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[Step], Unit]
    ): Unit = js.native
    def interpret_step(step: Step, scenario_context: typings.yadda.libContextMod.^): Unit = js.native
    def interpret_step(
      step: Step,
      scenario_context: typings.yadda.libContextMod.^,
      next: js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[Step], Unit]
    ): Unit = js.native
    
    def requires(libs: js.Array[typings.yadda.libLibraryMod.^]): this.type = js.native
    def requires(libs: typings.yadda.libLibraryMod.^): this.type = js.native
    
    def validate(scenario: Scenario): Unit = js.native
  }
}
