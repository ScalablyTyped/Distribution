package typings.umijsUseParams

import typings.std.Record
import typings.umijsUseParams.anon.Disabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@umijs/use-params", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useUrlSearchParams(): js.Tuple2[
    Record[String, String | Double], 
    js.Function1[/* value */ Record[String, String | Double], Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useUrlSearchParams")().asInstanceOf[js.Tuple2[
    Record[String, String | Double], 
    js.Function1[/* value */ Record[String, String | Double], Unit]
  ]]
  inline def useUrlSearchParams(initial: Unit, config: Disabled): js.Tuple2[
    Record[String, String | Double], 
    js.Function1[/* value */ Record[String, String | Double], Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useUrlSearchParams")(initial.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    Record[String, String | Double], 
    js.Function1[/* value */ Record[String, String | Double], Unit]
  ]]
  inline def useUrlSearchParams(initial: Record[String, String | Double]): js.Tuple2[
    Record[String, String | Double], 
    js.Function1[/* value */ Record[String, String | Double], Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useUrlSearchParams")(initial.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    Record[String, String | Double], 
    js.Function1[/* value */ Record[String, String | Double], Unit]
  ]]
  inline def useUrlSearchParams(initial: Record[String, String | Double], config: Disabled): js.Tuple2[
    Record[String, String | Double], 
    js.Function1[/* value */ Record[String, String | Double], Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useUrlSearchParams")(initial.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    Record[String, String | Double], 
    js.Function1[/* value */ Record[String, String | Double], Unit]
  ]]
}
