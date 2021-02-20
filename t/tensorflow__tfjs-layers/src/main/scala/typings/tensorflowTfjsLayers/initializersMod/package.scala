package typings.tensorflowTfjsLayers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object initializersMod {
  
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
  type InitializerIdentifier = typings.tensorflowTfjsLayers.initializersMod._InitializerIdentifier | java.lang.String
  
  @scala.inline
  def checkDistribution(): scala.Unit = typings.tensorflowTfjsLayers.initializersMod.^.asInstanceOf[js.Dynamic].applyDynamic("checkDistribution")().asInstanceOf[scala.Unit]
  @scala.inline
  def checkDistribution(value: java.lang.String): scala.Unit = typings.tensorflowTfjsLayers.initializersMod.^.asInstanceOf[js.Dynamic].applyDynamic("checkDistribution")(value.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def checkFanMode(): scala.Unit = typings.tensorflowTfjsLayers.initializersMod.^.asInstanceOf[js.Dynamic].applyDynamic("checkFanMode")().asInstanceOf[scala.Unit]
  @scala.inline
  def checkFanMode(value: java.lang.String): scala.Unit = typings.tensorflowTfjsLayers.initializersMod.^.asInstanceOf[js.Dynamic].applyDynamic("checkFanMode")(value.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def getInitializer(identifier: typings.tensorflowTfjsCore.serializationMod.ConfigDict): typings.tensorflowTfjsLayers.initializersMod.Initializer = typings.tensorflowTfjsLayers.initializersMod.^.asInstanceOf[js.Dynamic].applyDynamic("getInitializer")(identifier.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.initializersMod.Initializer]
  @scala.inline
  def getInitializer(identifier: typings.tensorflowTfjsLayers.initializersMod.Initializer): typings.tensorflowTfjsLayers.initializersMod.Initializer = typings.tensorflowTfjsLayers.initializersMod.^.asInstanceOf[js.Dynamic].applyDynamic("getInitializer")(identifier.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.initializersMod.Initializer]
  @scala.inline
  def getInitializer(identifier: typings.tensorflowTfjsLayers.initializersMod.InitializerIdentifier): typings.tensorflowTfjsLayers.initializersMod.Initializer = typings.tensorflowTfjsLayers.initializersMod.^.asInstanceOf[js.Dynamic].applyDynamic("getInitializer")(identifier.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.initializersMod.Initializer]
  
  @scala.inline
  def serializeInitializer(initializer: typings.tensorflowTfjsLayers.initializersMod.Initializer): typings.tensorflowTfjsCore.serializationMod.ConfigDictValue = typings.tensorflowTfjsLayers.initializersMod.^.asInstanceOf[js.Dynamic].applyDynamic("serializeInitializer")(initializer.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsCore.serializationMod.ConfigDictValue]
}
