package typings.yaml.anon

import org.scalablytyped.runtime.StringDictionary
import typings.yaml.distDocApplyReviverMod.Reviver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined yaml.yaml/dist/options.ToJSOptions & {[ignored: string] : unknown} */
trait ToJSOptionsignoredstringu
  extends StObject
     with /* ignored */ StringDictionary[Any] {
  
  /**
    * Use Map rather than Object to represent mappings.
    *
    * Default: `false`
    */
  var mapAsMap: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Prevent exponential entity expansion attacks by limiting data aliasing count;
    * set to `-1` to disable checks; `0` disallows all alias nodes.
    *
    * Default: `100`
    */
  var maxAliasCount: js.UndefOr[Double] = js.undefined
  
  /**
    * If defined, called with the resolved `value` and reference `count` for
    * each anchor in the document.
    */
  var onAnchor: js.UndefOr[js.Function2[/* value */ Any, /* count */ Double, Unit]] = js.undefined
  
  /**
    * Optional function that may filter or modify the output JS value
    *
    * https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/parse#using_the_reviver_parameter
    */
  var reviver: js.UndefOr[Reviver] = js.undefined
}
object ToJSOptionsignoredstringu {
  
  inline def apply(): ToJSOptionsignoredstringu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToJSOptionsignoredstringu]
  }
  
  extension [Self <: ToJSOptionsignoredstringu](x: Self) {
    
    inline def setMapAsMap(value: Boolean): Self = StObject.set(x, "mapAsMap", value.asInstanceOf[js.Any])
    
    inline def setMapAsMapUndefined: Self = StObject.set(x, "mapAsMap", js.undefined)
    
    inline def setMaxAliasCount(value: Double): Self = StObject.set(x, "maxAliasCount", value.asInstanceOf[js.Any])
    
    inline def setMaxAliasCountUndefined: Self = StObject.set(x, "maxAliasCount", js.undefined)
    
    inline def setOnAnchor(value: (/* value */ Any, /* count */ Double) => Unit): Self = StObject.set(x, "onAnchor", js.Any.fromFunction2(value))
    
    inline def setOnAnchorUndefined: Self = StObject.set(x, "onAnchor", js.undefined)
    
    inline def setReviver(value: (/* key */ Any, /* value */ Any) => Any): Self = StObject.set(x, "reviver", js.Any.fromFunction2(value))
    
    inline def setReviverUndefined: Self = StObject.set(x, "reviver", js.undefined)
  }
}
