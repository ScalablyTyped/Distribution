package typings
package typedocLib.distLibUtilsOptionsOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/options/options", "Options")
@js.native
class Options ()
  extends typedocLib.distLibUtilsComponentMod.ChildableComponent[typedocLib.distLibApplicationMod.Application, OptionsComponent] {
  var compilerOptions: js.Any = js.native
  var declarations: js.Any = js.native
  var values: js.Any = js.native
  def addDeclaration(declaration: typedocLib.distLibUtilsOptionsDeclarationMod.DeclarationOption): scala.Unit = js.native
  def addDeclaration(declaration: typedocLib.distLibUtilsOptionsDeclarationMod.OptionDeclaration): scala.Unit = js.native
  def addDeclarations(
    declarations: js.Array[
      typedocLib.distLibUtilsOptionsDeclarationMod.OptionDeclaration | typedocLib.distLibUtilsOptionsDeclarationMod.DeclarationOption
    ]
  ): scala.Unit = js.native
  def getCompilerOptions(): typescriptLib.typescriptMod.tsNs.CompilerOptions = js.native
  def getDeclaration(name: java.lang.String): js.UndefOr[typedocLib.distLibUtilsOptionsDeclarationMod.OptionDeclaration] = js.native
  def getDeclarationsByScope(scope: typedocLib.distLibUtilsOptionsDeclarationMod.ParameterScope): js.Array[typedocLib.distLibUtilsOptionsDeclarationMod.OptionDeclaration] = js.native
  def getRawValues(): js.Any = js.native
  def getValue(name: java.lang.String): js.Any = js.native
  def read(): OptionsReadResult = js.native
  def read(data: js.Any): OptionsReadResult = js.native
  def read(data: js.Any, mode: OptionsReadMode): OptionsReadResult = js.native
  def removeDeclaration(declaration: typedocLib.distLibUtilsOptionsDeclarationMod.OptionDeclaration): scala.Unit = js.native
  def removeDeclarationByName(name: java.lang.String): scala.Unit = js.native
  def setValue(name: java.lang.String, value: js.Any): scala.Unit = js.native
  def setValue(
    name: java.lang.String,
    value: js.Any,
    errorCallback: js.Function2[/* format */ java.lang.String, /* repeated */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def setValue(name: typedocLib.distLibUtilsOptionsDeclarationMod.OptionDeclaration, value: js.Any): scala.Unit = js.native
  def setValue(
    name: typedocLib.distLibUtilsOptionsDeclarationMod.OptionDeclaration,
    value: js.Any,
    errorCallback: js.Function2[/* format */ java.lang.String, /* repeated */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def setValues(obj: js.Object): scala.Unit = js.native
  def setValues(obj: js.Object, prefix: java.lang.String): scala.Unit = js.native
  def setValues(
    obj: js.Object,
    prefix: java.lang.String,
    errorCallback: js.Function2[/* format */ java.lang.String, /* repeated */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
}

