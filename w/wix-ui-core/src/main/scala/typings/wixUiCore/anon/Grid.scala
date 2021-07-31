package typings.wixUiCore.anon

import typings.react.mod.FC
import typings.std.Pick
import typings.wixUiCore.horizontalMenuColumnsLayoutHorizontalMenuColumnsLayoutMod.HorizontalMenuColumnsLayoutProps
import typings.wixUiCore.horizontalMenuGridLayoutHorizontalMenuGridLayoutMod.HorizontalMenuGridLayoutProps
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

trait Grid extends StObject {
  
  var Columns: FC[
    Pick[
      Pick[
        HorizontalMenuColumnsLayoutProps, 
        style | className | menuContext | maxOverflowWidth | columnGap | columns | columnsAlignment
      ], 
      style | className | maxOverflowWidth | columnGap | columns | columnsAlignment
    ]
  ]
  
  var Grid: FC[
    Pick[
      Pick[HorizontalMenuGridLayoutProps, style | className | menuContext | maxOverflowWidth], 
      style | className | maxOverflowWidth
    ]
  ]
}
object Grid {
  
  @scala.inline
  def apply(
    Columns: FC[
      Pick[
        Pick[
          HorizontalMenuColumnsLayoutProps, 
          style | className | menuContext | maxOverflowWidth | columnGap | columns | columnsAlignment
        ], 
        style | className | maxOverflowWidth | columnGap | columns | columnsAlignment
      ]
    ],
    Grid: FC[
      Pick[
        Pick[HorizontalMenuGridLayoutProps, style | className | menuContext | maxOverflowWidth], 
        style | className | maxOverflowWidth
      ]
    ]
  ): Grid = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], Grid = Grid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grid]
  }
  
  @scala.inline
  implicit class GridMutableBuilder[Self <: Grid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(
      value: FC[
          Pick[
            Pick[
              HorizontalMenuColumnsLayoutProps, 
              style | className | menuContext | maxOverflowWidth | columnGap | columns | columnsAlignment
            ], 
            style | className | maxOverflowWidth | columnGap | columns | columnsAlignment
          ]
        ]
    ): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrid(
      value: FC[
          Pick[
            Pick[HorizontalMenuGridLayoutProps, style | className | menuContext | maxOverflowWidth], 
            style | className | maxOverflowWidth
          ]
        ]
    ): Self = StObject.set(x, "Grid", value.asInstanceOf[js.Any])
  }
}
