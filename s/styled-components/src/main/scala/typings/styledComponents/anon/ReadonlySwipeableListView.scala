package typings.styledComponents.anon

import typings.react.mod.ReactElement
import typings.reactNative.mod.SwipeableListViewDataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<react-native.react-native.SwipeableListViewProps> */
@js.native
trait ReadonlySwipeableListView extends StObject {
  
  val bounceFirstRowOnMount: Boolean = js.native
  
  val dataSource: SwipeableListViewDataSource = js.native
  
  val maxSwipeDistance: Double = js.native
  
  val renderQuickActions: js.Function3[/* rowData */ js.Any, /* sectionID */ String, /* rowID */ String, ReactElement] = js.native
  
  val renderRow: js.Function3[/* rowData */ js.Any, /* sectionID */ String, /* rowID */ String, ReactElement] = js.native
}
object ReadonlySwipeableListView {
  
  @scala.inline
  def apply(
    bounceFirstRowOnMount: Boolean,
    dataSource: SwipeableListViewDataSource,
    maxSwipeDistance: Double,
    renderQuickActions: (/* rowData */ js.Any, /* sectionID */ String, /* rowID */ String) => ReactElement,
    renderRow: (/* rowData */ js.Any, /* sectionID */ String, /* rowID */ String) => ReactElement
  ): ReadonlySwipeableListView = {
    val __obj = js.Dynamic.literal(bounceFirstRowOnMount = bounceFirstRowOnMount.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], maxSwipeDistance = maxSwipeDistance.asInstanceOf[js.Any], renderQuickActions = js.Any.fromFunction3(renderQuickActions), renderRow = js.Any.fromFunction3(renderRow))
    __obj.asInstanceOf[ReadonlySwipeableListView]
  }
  
  @scala.inline
  implicit class ReadonlySwipeableListViewMutableBuilder[Self <: ReadonlySwipeableListView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounceFirstRowOnMount(value: Boolean): Self = StObject.set(x, "bounceFirstRowOnMount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSource(value: SwipeableListViewDataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSwipeDistance(value: Double): Self = StObject.set(x, "maxSwipeDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderQuickActions(value: (/* rowData */ js.Any, /* sectionID */ String, /* rowID */ String) => ReactElement): Self = StObject.set(x, "renderQuickActions", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRenderRow(value: (/* rowData */ js.Any, /* sectionID */ String, /* rowID */ String) => ReactElement): Self = StObject.set(x, "renderRow", js.Any.fromFunction3(value))
  }
}
