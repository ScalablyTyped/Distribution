package typings.tensorflowTfjsLayers.initializersMod

import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsCore.serializationMod.ConfigDictValue
import typings.tensorflowTfjsLayers.initializersMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def checkDistribution(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkDistribution")().asInstanceOf[Unit]
inline def checkDistribution(value: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkDistribution")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def checkFanMode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkFanMode")().asInstanceOf[Unit]
inline def checkFanMode(value: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkFanMode")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def getInitializer(identifier: ConfigDict): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitializer")(identifier.asInstanceOf[js.Any]).asInstanceOf[Initializer]
inline def getInitializer(identifier: Initializer): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitializer")(identifier.asInstanceOf[js.Any]).asInstanceOf[Initializer]
inline def getInitializer(identifier: InitializerIdentifier): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitializer")(identifier.asInstanceOf[js.Any]).asInstanceOf[Initializer]

inline def serializeInitializer(initializer: Initializer): ConfigDictValue = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeInitializer")(initializer.asInstanceOf[js.Any]).asInstanceOf[ConfigDictValue]

/* Rewritten from type alias, can be one of: 
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.constant_
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.glorotNormal
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.glorotUniform
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.heNormal
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.heUniform
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.identity_
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.leCunNormal
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.leCunUniform
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ones_
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.orthogonal_
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.randomNormal_
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.randomUniform_
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.truncatedNormal_
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.varianceScaling_
  - typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.zeros_
  - java.lang.String
*/
type InitializerIdentifier = _InitializerIdentifier | String
