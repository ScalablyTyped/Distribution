package typings.useEditable

import typings.useEditable.anon.Current
import typings.useEditable.distTypesUseEditableMod.Edit
import typings.useEditable.distTypesUseEditableMod.Options
import typings.useEditable.distTypesUseEditableMod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("use-editable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useEditable(elementRef: Current, onChange: js.Function2[/* text */ String, /* position */ Position, Unit]): Edit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEditable")(elementRef.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[Edit]
  inline def useEditable(
    elementRef: Current,
    onChange: js.Function2[/* text */ String, /* position */ Position, Unit],
    opts: Options
  ): Edit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEditable")(elementRef.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Edit]
}
