package typings.webpack.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cli {
  
  @JSImport("webpack", "cli")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("webpack", "cli.getArguments")
  @js.native
  def getArguments: js.Function1[/* schema */ js.UndefOr[Any], Record[String, Argument]] = js.native
  inline def getArguments_=(x: js.Function1[/* schema */ js.UndefOr[Any], Record[String, Argument]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getArguments")(x.asInstanceOf[js.Any])
  
  @JSImport("webpack", "cli.processArguments")
  @js.native
  def processArguments: js.Function3[
    /* args */ Record[String, Argument], 
    /* config */ Any, 
    /* values */ Record[
      String, 
      String | Double | Boolean | js.RegExp | (js.Array[String | Double | Boolean | js.RegExp])
    ], 
    Null | js.Array[Problem]
  ] = js.native
  inline def processArguments_=(
    x: js.Function3[
      /* args */ Record[String, Argument], 
      /* config */ Any, 
      /* values */ Record[
        String, 
        String | Double | Boolean | js.RegExp | (js.Array[String | Double | Boolean | js.RegExp])
      ], 
      Null | js.Array[Problem]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("processArguments")(x.asInstanceOf[js.Any])
}
