package typings.victoryCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Domain {
  
  @JSImport("victory-core/lib", "Domain")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDomainFunction(): js.Function2[/* props */ Any, /* axis */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDomainFunction")().asInstanceOf[js.Function2[/* props */ Any, /* axis */ Any, Any]]
  inline def createDomainFunction(getDomainFromDataFunction: Any): js.Function2[/* props */ Any, /* axis */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDomainFunction")(getDomainFromDataFunction.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* props */ Any, /* axis */ Any, Any]]
  inline def createDomainFunction(getDomainFromDataFunction: Any, formatDomainFunction: Any): js.Function2[/* props */ Any, /* axis */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDomainFunction")(getDomainFromDataFunction.asInstanceOf[js.Any], formatDomainFunction.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* props */ Any, /* axis */ Any, Any]]
  inline def createDomainFunction(getDomainFromDataFunction: Unit, formatDomainFunction: Any): js.Function2[/* props */ Any, /* axis */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDomainFunction")(getDomainFromDataFunction.asInstanceOf[js.Any], formatDomainFunction.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* props */ Any, /* axis */ Any, Any]]
  
  inline def formatDomain(domain: Any, props: Any, axis: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDomain")(domain.asInstanceOf[js.Any], props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getDomain(props: Any, axis: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getDomain")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getDomainFromCategories(props: Any, axis: Any): js.UndefOr[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDomainFromCategories")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[Any]]]
  inline def getDomainFromCategories(props: Any, axis: Any, categories: Any): js.UndefOr[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDomainFromCategories")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], categories.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[Any]]]
  
  inline def getDomainFromData(props: Any, axis: Any, dataset: Any): js.UndefOr[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDomainFromData")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], dataset.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[Any]]]
  
  inline def getDomainFromMinMax(min: Any, max: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDomainFromMinMax")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def getDomainFromProps(props: Any, axis: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getDomainFromProps")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getDomainWithZero(props: Any, axis: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getDomainWithZero")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getMaxFromProps(props: Any, axis: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMaxFromProps")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getMinFromProps(props: Any, axis: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMinFromProps")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getSymmetricDomain(domain: Any, values: js.Array[Double]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSymmetricDomain")(domain.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def isDomainComponent(component: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDomainComponent")(component.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
