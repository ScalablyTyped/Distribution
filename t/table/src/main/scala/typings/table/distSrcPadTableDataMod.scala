package typings.table

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPadTableDataMod {
  
  @JSImport("table/dist/src/padTableData", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def padString(input: String, paddingLeft: Double, paddingRight: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("padString")(input.asInstanceOf[js.Any], paddingLeft.asInstanceOf[js.Any], paddingRight.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def padTableData(
    rows: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Row */ Any
    ],
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BaseConfig */ Any
  ): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Row */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("padTableData")(rows.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Row */ Any
  ]]
}
