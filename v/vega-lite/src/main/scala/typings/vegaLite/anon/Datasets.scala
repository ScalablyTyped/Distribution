package typings.vegaLite.anon

import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaLite.buildSrcUtilMod.Dict
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Datasets extends StObject {
  
  /**
    * URL to [JSON schema](http://json-schema.org/) for a Vega-Lite specification. Unless you have a reason to change this, use `https://vega.github.io/schema/vega-lite/v5.json`. Setting the `$schema` property allows automatic validation and autocomplete in editors that support JSON schema.
    * @format uri
    */
  @JSName("$schema")
  var $schema: js.UndefOr[String] = js.undefined
  
  /**
    * Vega-Lite configuration object. This property can only be defined at the top-level of a specification.
    */
  var config: js.UndefOr[typings.vegaLite.buildSrcConfigMod.Config[ExprRef | SignalRef]] = js.undefined
  
  /**
    * A global data store for named datasets. This is a mapping from names to inline datasets.
    * This can be an array of objects or primitive values or a string. Arrays of primitive values are ingested as objects with a `data` property.
    */
  var datasets: js.UndefOr[typings.vegaLite.buildSrcSpecToplevelMod.Datasets] = js.undefined
  
  /**
    * Optional metadata that will be passed to Vega.
    * This object is completely ignored by Vega and Vega-Lite and can be used for custom metadata.
    */
  var usermeta: js.UndefOr[Dict[Any]] = js.undefined
}
object Datasets {
  
  inline def apply(): Datasets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Datasets]
  }
  
  extension [Self <: Datasets](x: Self) {
    
    inline def set$schema(value: String): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
    
    inline def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
    
    inline def setConfig(value: typings.vegaLite.buildSrcConfigMod.Config[ExprRef | SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setDatasets(value: typings.vegaLite.buildSrcSpecToplevelMod.Datasets): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
    
    inline def setDatasetsUndefined: Self = StObject.set(x, "datasets", js.undefined)
    
    inline def setUsermeta(value: Dict[Any]): Self = StObject.set(x, "usermeta", value.asInstanceOf[js.Any])
    
    inline def setUsermetaUndefined: Self = StObject.set(x, "usermeta", js.undefined)
  }
}
