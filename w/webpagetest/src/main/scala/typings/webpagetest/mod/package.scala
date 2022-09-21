package typings.webpagetest.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* static member */
inline def defaultListenPort: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultListenPort").asInstanceOf[Double]
inline def defaultListenPort_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultListenPort")(x.asInstanceOf[js.Any])

/* static member */
inline def defaultServer: String = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultServer").asInstanceOf[String]
inline def defaultServer_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultServer")(x.asInstanceOf[js.Any])

/* static member */
inline def defaultWaitResultsPort: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultWaitResultsPort").asInstanceOf[Double]
inline def defaultWaitResultsPort_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultWaitResultsPort")(x.asInstanceOf[js.Any])

/* static member */
inline def scriptToString(script: TestScript): String = ^.asInstanceOf[js.Dynamic].applyDynamic("scriptToString")(script.asInstanceOf[js.Any]).asInstanceOf[String]

/* static member */
inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]
inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])

type Callback[R] = js.Function3[/* err */ js.UndefOr[js.Error], /* data */ js.UndefOr[R], /* info */ Any, Unit]

type TestScript = js.Array[TestScriptCommand]

type TestScriptCommand = String | (StringDictionary[String | Double | (js.Array[Double | String])])
