package typings.victoryAxis.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Domain extends StObject {
  
  var domain: X
  
  var height: Any
  
  var horizontal: Any
  
  var padding: Any
  
  var polar: Any
  
  var scale: StringDictionary[
    js.UndefOr[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.D3Scale<any> */ Any
    ]
  ]
  
  var standalone: Any
  
  var stringTicks: Any
  
  var style: Any
  
  var theme: Any
  
  var ticks: js.Array[Double]
  
  var width: Any
}
object Domain {
  
  inline def apply(
    domain: X,
    height: Any,
    horizontal: Any,
    padding: Any,
    polar: Any,
    scale: StringDictionary[
      js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.D3Scale<any> */ Any
      ]
    ],
    standalone: Any,
    stringTicks: Any,
    style: Any,
    theme: Any,
    ticks: js.Array[Double],
    width: Any
  ): Domain = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], polar = polar.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], standalone = standalone.asInstanceOf[js.Any], stringTicks = stringTicks.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Domain]
  }
  
  extension [Self <: Domain](x: Self) {
    
    inline def setDomain(value: X): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHorizontal(value: Any): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: Any): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPolar(value: Any): Self = StObject.set(x, "polar", value.asInstanceOf[js.Any])
    
    inline def setScale(
      value: StringDictionary[
          js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.D3Scale<any> */ Any
          ]
        ]
    ): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setStandalone(value: Any): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
    
    inline def setStringTicks(value: Any): Self = StObject.set(x, "stringTicks", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: Any): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setTicks(value: js.Array[Double]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setTicksVarargs(value: Double*): Self = StObject.set(x, "ticks", js.Array(value*))
    
    inline def setWidth(value: Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
