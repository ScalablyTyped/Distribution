package typings.tslint

import org.scalablytyped.runtime.Instantiable0
import typings.tslint.libLanguageRuleRuleMod.RuleFailure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLanguageFormatterFormatterMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.tslint.tslintStrings.human
    - typings.tslint.tslintStrings.machine
  */
  trait ConsumerType extends StObject
  object ConsumerType {
    
    inline def human: typings.tslint.tslintStrings.human = "human".asInstanceOf[typings.tslint.tslintStrings.human]
    
    inline def machine: typings.tslint.tslintStrings.machine = "machine".asInstanceOf[typings.tslint.tslintStrings.machine]
  }
  
  @js.native
  trait FormatterConstructor
    extends StObject
       with Instantiable0[IFormatter]
  
  @js.native
  trait IFormatter extends StObject {
    
    /**
      * Formats linter results
      * @param failures Linter failures that were not fixed
      * @param fixes Fixed linter failures. Available when the `--fix` argument is used on the command line
      * @param fileNames All of the file paths that were linted
      */
    def format(failures: js.Array[RuleFailure]): String = js.native
    def format(failures: js.Array[RuleFailure], fixes: js.Array[RuleFailure]): String = js.native
    def format(failures: js.Array[RuleFailure], fixes: js.Array[RuleFailure], fileNames: js.Array[String]): String = js.native
    def format(failures: js.Array[RuleFailure], fixes: Unit, fileNames: js.Array[String]): String = js.native
  }
  
  trait IFormatterMetadata extends StObject {
    
    /**
      * Sample output from the formatter.
      */
    var consumer: ConsumerType
    
    /**
      * A short, one line description of what the formatter does.
      */
    var description: String
    
    /**
      * More elaborate details about the formatter.
      */
    var descriptionDetails: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the formatter.
      */
    var formatterName: String
    
    /**
      * Sample output from the formatter.
      */
    var sample: String
  }
  object IFormatterMetadata {
    
    inline def apply(consumer: ConsumerType, description: String, formatterName: String, sample: String): IFormatterMetadata = {
      val __obj = js.Dynamic.literal(consumer = consumer.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], formatterName = formatterName.asInstanceOf[js.Any], sample = sample.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFormatterMetadata]
    }
    
    extension [Self <: IFormatterMetadata](x: Self) {
      
      inline def setConsumer(value: ConsumerType): Self = StObject.set(x, "consumer", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionDetails(value: String): Self = StObject.set(x, "descriptionDetails", value.asInstanceOf[js.Any])
      
      inline def setDescriptionDetailsUndefined: Self = StObject.set(x, "descriptionDetails", js.undefined)
      
      inline def setFormatterName(value: String): Self = StObject.set(x, "formatterName", value.asInstanceOf[js.Any])
      
      inline def setSample(value: String): Self = StObject.set(x, "sample", value.asInstanceOf[js.Any])
    }
  }
}
