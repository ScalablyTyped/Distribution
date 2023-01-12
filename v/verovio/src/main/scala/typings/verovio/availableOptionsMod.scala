package typings.verovio

import org.scalablytyped.runtime.StringDictionary
import typings.verovio.anon.Name
import typings.verovio.verovioStrings.`stdColonColonstring-list`
import typings.verovio.verovioStrings.array
import typings.verovio.verovioStrings.bool
import typings.verovio.verovioStrings.double
import typings.verovio.verovioStrings.int
import typings.verovio.verovioStrings.stdColonColonstring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object availableOptionsMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.verovio.availableOptionsMod.JsonOption
    - typings.verovio.availableOptionsMod.IntOption
    - typings.verovio.availableOptionsMod.DoubleOption
    - typings.verovio.availableOptionsMod.StringArrayOption
    - typings.verovio.availableOptionsMod.StringOption
    - typings.verovio.availableOptionsMod.EnumOption
    - typings.verovio.availableOptionsMod.BooleanOption
  */
  trait AnyOption extends StObject
  object AnyOption {
    
    inline def BooleanOption(description: String, title: String, values: Unit): typings.verovio.availableOptionsMod.BooleanOption = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("bool")
      __obj.asInstanceOf[typings.verovio.availableOptionsMod.BooleanOption]
    }
    
    inline def DoubleOption(description: String, title: String, values: Unit): typings.verovio.availableOptionsMod.DoubleOption = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("double")
      __obj.asInstanceOf[typings.verovio.availableOptionsMod.DoubleOption]
    }
    
    inline def EnumOption(description: String, title: String, values: js.Array[String]): typings.verovio.availableOptionsMod.EnumOption = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("std::string-list")
      __obj.asInstanceOf[typings.verovio.availableOptionsMod.EnumOption]
    }
    
    inline def IntOption(description: String, title: String, values: Unit): typings.verovio.availableOptionsMod.IntOption = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("int")
      __obj.asInstanceOf[typings.verovio.availableOptionsMod.IntOption]
    }
    
    inline def JsonOption(description: String, title: String, `type`: Unit, values: Unit): typings.verovio.availableOptionsMod.JsonOption = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.verovio.availableOptionsMod.JsonOption]
    }
    
    inline def StringArrayOption(description: String, title: String, values: Unit): typings.verovio.availableOptionsMod.StringArrayOption = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("array")
      __obj.asInstanceOf[typings.verovio.availableOptionsMod.StringArrayOption]
    }
    
    inline def StringOption(description: String, title: String, values: Unit): typings.verovio.availableOptionsMod.StringOption = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("std::string")
      __obj.asInstanceOf[typings.verovio.availableOptionsMod.StringOption]
    }
  }
  
  trait AvailableOptions extends StObject {
    
    var groups: StringDictionary[Name]
  }
  object AvailableOptions {
    
    inline def apply(groups: StringDictionary[Name]): AvailableOptions = {
      val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvailableOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvailableOptions] (val x: Self) extends AnyVal {
      
      inline def setGroups(value: StringDictionary[Name]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    }
  }
  
  trait BooleanOption
    extends StObject
       with VerovioOption
       with AnyOption {
    
    var default: js.UndefOr[Boolean] = js.undefined
    
    var `type`: bool
    
    var values: Unit
  }
  object BooleanOption {
    
    inline def apply(description: String, title: String, values: Unit): BooleanOption = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("bool")
      __obj.asInstanceOf[BooleanOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BooleanOption] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setType(value: bool): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Unit): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait DoubleOption
    extends StObject
       with VerovioOption
       with AnyOption {
    
    var default: js.UndefOr[Double] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var `type`: double
    
    var values: Unit
  }
  object DoubleOption {
    
    inline def apply(description: String, title: String, values: Unit): DoubleOption = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("double")
      __obj.asInstanceOf[DoubleOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DoubleOption] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: Double): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setType(value: double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Unit): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait EnumOption
    extends StObject
       with VerovioOption
       with AnyOption {
    
    var default: js.UndefOr[String] = js.undefined
    
    var `type`: `stdColonColonstring-list`
    
    var values: js.Array[String]
  }
  object EnumOption {
    
    inline def apply(description: String, title: String, values: js.Array[String]): EnumOption = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("std::string-list")
      __obj.asInstanceOf[EnumOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EnumOption] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setType(value: `stdColonColonstring-list`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait IntOption
    extends StObject
       with VerovioOption
       with AnyOption {
    
    var default: js.UndefOr[Double] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var `type`: int
    
    var values: Unit
  }
  object IntOption {
    
    inline def apply(description: String, title: String, values: Unit): IntOption = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("int")
      __obj.asInstanceOf[IntOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IntOption] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: Double): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setType(value: int): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Unit): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait JsonOption
    extends StObject
       with VerovioOption
       with AnyOption {
    
    var `type`: Unit
    
    var values: Unit
  }
  object JsonOption {
    
    inline def apply(description: String, title: String, `type`: Unit, values: Unit): JsonOption = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JsonOption] (val x: Self) extends AnyVal {
      
      inline def setType(value: Unit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Unit): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait StringArrayOption
    extends StObject
       with VerovioOption
       with AnyOption {
    
    var default: js.UndefOr[js.Array[String]] = js.undefined
    
    var `type`: array
    
    var values: Unit
  }
  object StringArrayOption {
    
    inline def apply(description: String, title: String, values: Unit): StringArrayOption = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("array")
      __obj.asInstanceOf[StringArrayOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StringArrayOption] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: js.Array[String]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDefaultVarargs(value: String*): Self = StObject.set(x, "default", js.Array(value*))
      
      inline def setType(value: array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Unit): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait StringOption
    extends StObject
       with VerovioOption
       with AnyOption {
    
    var default: js.UndefOr[String] = js.undefined
    
    var `type`: stdColonColonstring
    
    var values: Unit
  }
  object StringOption {
    
    inline def apply(description: String, title: String, values: Unit): StringOption = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("std::string")
      __obj.asInstanceOf[StringOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StringOption] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setType(value: stdColonColonstring): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Unit): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait VerovioOption extends StObject {
    
    var cmdOnly: js.UndefOr[Boolean] = js.undefined
    
    var description: String
    
    var shortOption: js.UndefOr[String] = js.undefined
    
    var title: String
  }
  object VerovioOption {
    
    inline def apply(description: String, title: String): VerovioOption = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerovioOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VerovioOption] (val x: Self) extends AnyVal {
      
      inline def setCmdOnly(value: Boolean): Self = StObject.set(x, "cmdOnly", value.asInstanceOf[js.Any])
      
      inline def setCmdOnlyUndefined: Self = StObject.set(x, "cmdOnly", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setShortOption(value: String): Self = StObject.set(x, "shortOption", value.asInstanceOf[js.Any])
      
      inline def setShortOptionUndefined: Self = StObject.set(x, "shortOption", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
