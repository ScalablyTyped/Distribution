package typings.webpagetest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback[R] = js.Function3[
    /* err */ js.UndefOr[typings.std.Error], 
    /* data */ js.UndefOr[R], 
    /* info */ js.Any, 
    scala.Unit
  ]
  
  type TestScript = js.Array[typings.webpagetest.mod.TestScriptCommand]
  
  type TestScriptCommand = java.lang.String | (org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | (js.Array[scala.Double | java.lang.String])])
  
  /* static member */
  @scala.inline
  def defaultListenPort: scala.Double = typings.webpagetest.mod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultListenPort").asInstanceOf[scala.Double]
  @scala.inline
  def defaultListenPort_=(x: scala.Double): scala.Unit = typings.webpagetest.mod.^.asInstanceOf[js.Dynamic].updateDynamic("defaultListenPort")(x.asInstanceOf[js.Any])
  
  /* static member */
  @scala.inline
  def defaultServer: java.lang.String = typings.webpagetest.mod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultServer").asInstanceOf[java.lang.String]
  @scala.inline
  def defaultServer_=(x: java.lang.String): scala.Unit = typings.webpagetest.mod.^.asInstanceOf[js.Dynamic].updateDynamic("defaultServer")(x.asInstanceOf[js.Any])
  
  /* static member */
  @scala.inline
  def defaultWaitResultsPort: scala.Double = typings.webpagetest.mod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultWaitResultsPort").asInstanceOf[scala.Double]
  @scala.inline
  def defaultWaitResultsPort_=(x: scala.Double): scala.Unit = typings.webpagetest.mod.^.asInstanceOf[js.Dynamic].updateDynamic("defaultWaitResultsPort")(x.asInstanceOf[js.Any])
  
  /* static member */
  @scala.inline
  def scriptToString(script: typings.webpagetest.mod.TestScript): java.lang.String = typings.webpagetest.mod.^.asInstanceOf[js.Dynamic].applyDynamic("scriptToString")(script.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /* static member */
  @scala.inline
  def version: java.lang.String = typings.webpagetest.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
  @scala.inline
  def version_=(x: java.lang.String): scala.Unit = typings.webpagetest.mod.^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
}
