package typings.tengitsui.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.std.Element
import typings.tengitsui.mod.^
import typings.tengitsui.tengitsuiStrings.multiple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def ArrayCtrl(): js.Function3[
/* com */ ComponentType[Any], 
/* plus */ js.UndefOr[ComponentType[Any]], 
/* ctrl */ js.UndefOr[ComponentType[Any]], 
ComponentType[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ArrayCtrl")().asInstanceOf[js.Function3[
/* com */ ComponentType[Any], 
/* plus */ js.UndefOr[ComponentType[Any]], 
/* ctrl */ js.UndefOr[ComponentType[Any]], 
ComponentType[Any]]]

type AdvancedSchema = StringDictionary[AdvancedField]

type ColumnRender = js.Function1[/* props */ RenderProps, Any]

type ColumnSchema = StringDictionary[TableField]

type ComputeFnc = js.Function2[/* record */ Record, /* field */ String, Any]

type Errros = StringDictionary[js.UndefOr[Boolean | String]]

type FeildMode = multiple

type Fields = StringDictionary[Any]

type FormSchema = StringDictionary[FormField]

type Layout = js.Function1[/* props */ js.Object, js.Array[Element]]

type OptionComputeFnc = js.Function2[
/* record */ Record, 
/* options */ js.Array[Option_], 
js.Array[Option_] | js.Promise[js.Array[Option_]]]

type Record = StringDictionary[Any]

type Schema = StringDictionary[Field]

type actionGen = js.Function1[/* record */ js.Object, Boolean]

type clickFn = js.Function2[/* record */ js.Object, /* params */ js.Object, Unit]

type editableFnc = js.Function1[/* record */ Record, Boolean]

type onChange = js.Function1[/* value */ Any, Unit]

type optionCompute = js.Function2[/* fields */ Fields, /* options */ js.Array[Option_], js.Array[Option_]]

type selectFn = js.Function3[
/* itor */ js.Iterable[Element], 
/* slen */ Double, 
/* dlen */ Double, 
js.Array[Element]]

type visibleFnc = js.Function1[/* params */ typings.tengitsui.anon.Fields, Boolean]

type voidFunc = js.Function0[Unit]
