package typings.wixUiCore.anon

import typings.react.mod.FC
import typings.std.Pick
import typings.wixUiCore.componentsHorizontalMenuHorizontalMenuColumnsLayoutHorizontalMenuColumnsLayoutMod.HorizontalMenuColumnsLayoutProps
import typings.wixUiCore.componentsHorizontalMenuHorizontalMenuGridLayoutHorizontalMenuGridLayoutMod.HorizontalMenuGridLayoutProps
import typings.wixUiCore.wixUiCoreStrings.className
import typings.wixUiCore.wixUiCoreStrings.columnGap
import typings.wixUiCore.wixUiCoreStrings.columns
import typings.wixUiCore.wixUiCoreStrings.columnsAlignment
import typings.wixUiCore.wixUiCoreStrings.maxOverflowWidth
import typings.wixUiCore.wixUiCoreStrings.menuContext
import typings.wixUiCore.wixUiCoreStrings.style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnsFCGridFC extends StObject {
  
  var Columns: FC[
    Pick[
      Pick[
        HorizontalMenuColumnsLayoutProps, 
        className | style | maxOverflowWidth | menuContext | columnGap | columns | columnsAlignment
      ], 
      className | style | maxOverflowWidth | columnGap | columns | columnsAlignment
    ]
  ]
  
  var Grid: FC[
    Pick[
      Pick[HorizontalMenuGridLayoutProps, className | style | maxOverflowWidth | menuContext], 
      className | style | maxOverflowWidth
    ]
  ]
}
object ColumnsFCGridFC {
  
  inline def apply(
    Columns: FC[
      Pick[
        Pick[
          HorizontalMenuColumnsLayoutProps, 
          className | style | maxOverflowWidth | menuContext | columnGap | columns | columnsAlignment
        ], 
        className | style | maxOverflowWidth | columnGap | columns | columnsAlignment
      ]
    ],
    Grid: FC[
      Pick[
        Pick[HorizontalMenuGridLayoutProps, className | style | maxOverflowWidth | menuContext], 
        className | style | maxOverflowWidth
      ]
    ]
  ): ColumnsFCGridFC = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], Grid = Grid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnsFCGridFC]
  }
  
  extension [Self <: ColumnsFCGridFC](x: Self) {
    
    inline def setColumns(
      value: FC[
          Pick[
            Pick[
              HorizontalMenuColumnsLayoutProps, 
              className | style | maxOverflowWidth | menuContext | columnGap | columns | columnsAlignment
            ], 
            className | style | maxOverflowWidth | columnGap | columns | columnsAlignment
          ]
        ]
    ): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    inline def setGrid(
      value: FC[
          Pick[
            Pick[HorizontalMenuGridLayoutProps, className | style | maxOverflowWidth | menuContext], 
            className | style | maxOverflowWidth
          ]
        ]
    ): Self = StObject.set(x, "Grid", value.asInstanceOf[js.Any])
  }
}
