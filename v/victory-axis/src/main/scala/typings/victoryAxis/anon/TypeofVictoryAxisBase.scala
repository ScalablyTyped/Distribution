package typings.victoryAxis.anon

import typings.victoryAxis.victoryAxisStrings.crossAxis
import typings.victoryAxis.victoryAxisStrings.domain
import typings.victoryAxis.victoryAxisStrings.events
import typings.victoryAxis.victoryAxisStrings.fixLabelOverlap
import typings.victoryAxis.victoryAxisStrings.offsetX
import typings.victoryAxis.victoryAxisStrings.offsetY
import typings.victoryAxis.victoryAxisStrings.orientation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofVictoryAxisBase extends StObject {
  
  /* static member */
  var animationWhitelist: js.Array[crossAxis | domain | events | fixLabelOverlap | offsetX | offsetY | orientation]
  
  /* static member */
  var defaultProps: AxisComponent
  
  /* static member */
  var defaultTransitions: OnEnter
  
  /* static member */
  var displayName: String
  
  /* static member */
  var expectedComponents: js.Array[crossAxis | domain | events | fixLabelOverlap | offsetX | offsetY | orientation]
  
  /* static member */
  var getBaseProps: js.Function1[/* props */ Any, Parent]
  
  /* static member */
  var getStyles: js.Function1[/* props */ Any, Axis]
  
  /* static member */
  var propTypes: Animate
  
  /* static member */
  var role: String
}
object TypeofVictoryAxisBase {
  
  inline def apply(
    animationWhitelist: js.Array[crossAxis | domain | events | fixLabelOverlap | offsetX | offsetY | orientation],
    defaultProps: AxisComponent,
    defaultTransitions: OnEnter,
    displayName: String,
    expectedComponents: js.Array[crossAxis | domain | events | fixLabelOverlap | offsetX | offsetY | orientation],
    getBaseProps: /* props */ Any => Parent,
    getStyles: /* props */ Any => Axis,
    propTypes: Animate,
    role: String
  ): TypeofVictoryAxisBase = {
    val __obj = js.Dynamic.literal(animationWhitelist = animationWhitelist.asInstanceOf[js.Any], defaultProps = defaultProps.asInstanceOf[js.Any], defaultTransitions = defaultTransitions.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], expectedComponents = expectedComponents.asInstanceOf[js.Any], getBaseProps = js.Any.fromFunction1(getBaseProps), getStyles = js.Any.fromFunction1(getStyles), propTypes = propTypes.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofVictoryAxisBase]
  }
  
  extension [Self <: TypeofVictoryAxisBase](x: Self) {
    
    inline def setAnimationWhitelist(value: js.Array[crossAxis | domain | events | fixLabelOverlap | offsetX | offsetY | orientation]): Self = StObject.set(x, "animationWhitelist", value.asInstanceOf[js.Any])
    
    inline def setAnimationWhitelistVarargs(value: (crossAxis | domain | events | fixLabelOverlap | offsetX | offsetY | orientation)*): Self = StObject.set(x, "animationWhitelist", js.Array(value*))
    
    inline def setDefaultProps(value: AxisComponent): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultTransitions(value: OnEnter): Self = StObject.set(x, "defaultTransitions", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setExpectedComponents(value: js.Array[crossAxis | domain | events | fixLabelOverlap | offsetX | offsetY | orientation]): Self = StObject.set(x, "expectedComponents", value.asInstanceOf[js.Any])
    
    inline def setExpectedComponentsVarargs(value: (crossAxis | domain | events | fixLabelOverlap | offsetX | offsetY | orientation)*): Self = StObject.set(x, "expectedComponents", js.Array(value*))
    
    inline def setGetBaseProps(value: /* props */ Any => Parent): Self = StObject.set(x, "getBaseProps", js.Any.fromFunction1(value))
    
    inline def setGetStyles(value: /* props */ Any => Axis): Self = StObject.set(x, "getStyles", js.Any.fromFunction1(value))
    
    inline def setPropTypes(value: Animate): Self = StObject.set(x, "propTypes", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
