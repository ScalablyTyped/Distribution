package typings.typedoc

import typings.std.ClassDecorator
import typings.std.PropertyDecorator
import typings.typedoc.distLibUtilsComponentMod.Component
import typings.typedoc.distLibUtilsComponentMod.ComponentHost
import typings.typedoc.distLibUtilsComponentMod.ComponentOptions
import typings.typedoc.distLibUtilsOptionsDeclarationMod.DeclarationOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils", JSImport.Namespace)
@js.native
object distLibUtilsMod extends js.Object {
  @js.native
  abstract class AbstractComponent[O /* <: ComponentHost */] protected ()
    extends typings.typedoc.distLibUtilsComponentMod.AbstractComponent[O] {
    def this(owner: O) = this()
    def this(owner: js.Symbol) = this()
  }
  
  @js.native
  class CallbackLogger protected ()
    extends typings.typedoc.distLibUtilsLoggersMod.CallbackLogger {
    def this(callback: js.Function) = this()
  }
  
  @js.native
  abstract class ChildableComponent[O /* <: ComponentHost */, C /* <: Component */] protected ()
    extends typings.typedoc.distLibUtilsComponentMod.ChildableComponent[O, C] {
    def this(owner: O) = this()
    def this(owner: js.Symbol) = this()
  }
  
  @js.native
  class ConsoleLogger ()
    extends typings.typedoc.distLibUtilsLoggersMod.ConsoleLogger
  
  @js.native
  class Event protected ()
    extends typings.typedoc.distLibUtilsEventsMod.Event {
    def this(name: String) = this()
  }
  
  @js.native
  class EventDispatcher ()
    extends typings.typedoc.distLibUtilsEventsMod.EventDispatcher
  
  @js.native
  class Logger ()
    extends typings.typedoc.distLibUtilsLoggersMod.Logger
  
  @js.native
  class PluginHost ()
    extends typings.typedoc.distLibUtilsPluginsMod.PluginHost
  
  def Component(options: ComponentOptions): ClassDecorator = js.native
  def Option(options: DeclarationOption): PropertyDecorator = js.native
  def directoryExists(directoryPath: String): Boolean = js.native
  def ensureDirectoriesExist(directoryPath: String): Unit = js.native
  def normalizePath(path: String): String = js.native
  def writeFile(fileName: String, data: String, writeByteOrderMark: Boolean): Unit = js.native
  def writeFile(
    fileName: String,
    data: String,
    writeByteOrderMark: Boolean,
    onError: js.Function1[/* message */ String, Unit]
  ): Unit = js.native
  @js.native
  object LogLevel extends js.Object {
    /* 3 */ val Error: typings.typedoc.distLibUtilsLoggersMod.LogLevel.Error with Double = js.native
    /* 1 */ val Info: typings.typedoc.distLibUtilsLoggersMod.LogLevel.Info with Double = js.native
    /* 4 */ val Success: typings.typedoc.distLibUtilsLoggersMod.LogLevel.Success with Double = js.native
    /* 0 */ val Verbose: typings.typedoc.distLibUtilsLoggersMod.LogLevel.Verbose with Double = js.native
    /* 2 */ val Warn: typings.typedoc.distLibUtilsLoggersMod.LogLevel.Warn with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.typedoc.distLibUtilsLoggersMod.LogLevel with Double] = js.native
  }
  
}

