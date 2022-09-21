package typings.uirouterCore.mod

import typings.uirouterCore.paramsInterfaceMod.ParamTypeDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/core", "ParamType")
@js.native
open class ParamType protected ()
  extends typings.uirouterCore.paramsMod.ParamType {
  /**
    * @param def  A configuration object which contains the custom type definition.  The object's
    *        properties will override the default methods and/or pattern in `ParamType`'s public interface.
    * @returns a new ParamType object
    */
  def this(`def`: ParamTypeDefinition) = this()
}
