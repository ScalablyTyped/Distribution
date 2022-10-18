package typings.stylableRuntime

import typings.std.Record
import typings.stylableRuntime.distTypesMod.ClassesMap
import typings.stylableRuntime.distTypesMod.RuntimeStVar
import typings.stylableRuntime.distTypesMod.STFunction
import typings.stylableRuntime.distTypesMod.StateMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesheetMod {
  
  @JSImport("@stylable/runtime/stylesheet", "classes")
  @js.native
  val classes: ClassesMap = js.native
  
  @JSImport("@stylable/runtime/stylesheet", "cssStates")
  @js.native
  val cssStates: js.Function1[/* stateMap */ StateMap, String] = js.native
  
  @JSImport("@stylable/runtime/stylesheet", "keyframes")
  @js.native
  val keyframes: Record[String, String] = js.native
  
  @JSImport("@stylable/runtime/stylesheet", "layers")
  @js.native
  val layers: Record[String, String] = js.native
  
  @JSImport("@stylable/runtime/stylesheet", "namespace")
  @js.native
  val namespace: String = js.native
  
  @JSImport("@stylable/runtime/stylesheet", "st")
  @js.native
  val st: STFunction = js.native
  
  @JSImport("@stylable/runtime/stylesheet", "stVars")
  @js.native
  val stVars: Record[String, RuntimeStVar] = js.native
  
  @JSImport("@stylable/runtime/stylesheet", "style")
  @js.native
  val style: STFunction = js.native
  
  @JSImport("@stylable/runtime/stylesheet", "vars")
  @js.native
  val vars: Record[String, String] = js.native
}
