package typings
package synapticLib.synapticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("synaptic", "Trainer")
@js.native
class Trainer protected () extends js.Object {
  /**
       * The Trainer makes it easier to train any set to any network, no matter its architecture. The trainer also contains built-in tasks to test the performance of your network.
       * @param network
       */
  def this(network: Network) = this()
  /**
       * This method trains the network to complete a Discrete Sequence Recall, which is a task for testing context memory in neural networks.
       */
  def DSR(): synapticLib.synapticMod.TrainerNs.DSRTrainingResult = js.native
  /**
       * This method trains the network to complete a Discrete Sequence Recall, which is a task for testing context memory in neural networks.
       */
  def DSR(options: synapticLib.synapticMod.TrainerNs.DSROptions): synapticLib.synapticMod.TrainerNs.DSRTrainingResult = js.native
  /**
       * This method trains the network to pass an Embedded Reber Grammar test.
       */
  def ERG(): synapticLib.synapticMod.TrainerNs.ERGTrainingResult = js.native
  /**
       * This method trains the network to pass an Embedded Reber Grammar test.
       */
  def ERG(options: synapticLib.synapticMod.TrainerNs.ERGOptions): synapticLib.synapticMod.TrainerNs.ERGTrainingResult = js.native
  /**
       * This method trains an XOR to the network, is useful when you are experimenting with different architectures and you want to test and compare their performances.
       */
  def XOR(): synapticLib.synapticMod.TrainerNs.TrainingResult = js.native
  /**
       * This method trains an XOR to the network, is useful when you are experimenting with different architectures and you want to test and compare their performances.
       */
  def XOR(options: synapticLib.synapticMod.TrainerNs.XOROptions): synapticLib.synapticMod.TrainerNs.TrainingResult = js.native
  /**
       * This method accepts the same arguments as train(dataSet, options). It will iterate over the dataSet, activating the network.
       * @returns It returns the elapsed time and the error (by default, the MSE, but you can specify the cost function in the options, same way as in train()).
       */
  def test(trainingSet: synapticLib.synapticMod.TrainerNs.TrainingSet): synapticLib.synapticMod.TrainerNs.TrainingResult = js.native
  /**
       * This method accepts the same arguments as train(dataSet, options). It will iterate over the dataSet, activating the network.
       * @returns It returns the elapsed time and the error (by default, the MSE, but you can specify the cost function in the options, same way as in train()).
       */
  def test(
    trainingSet: synapticLib.synapticMod.TrainerNs.TrainingSet,
    trainingOptions: synapticLib.synapticMod.TrainerNs.TrainingOptions
  ): synapticLib.synapticMod.TrainerNs.TrainingResult = js.native
  /**
       * This test challenges the network to complete a timing task.
       */
  def timingTask(): synapticLib.Anon_Train = js.native
  /**
       * This test challenges the network to complete a timing task.
       */
  def timingTask(options: js.Any): synapticLib.Anon_Train = js.native
  /**
       * This method allows you to train any training set to a Network.
       * @returns When the training is done this method returns an object with the error, the iterations, and the elapsed time of the training.
       */
  def train(trainingSet: synapticLib.synapticMod.TrainerNs.TrainingSet): synapticLib.synapticMod.TrainerNs.TrainingResult = js.native
  /**
       * This method allows you to train any training set to a Network.
       * @returns When the training is done this method returns an object with the error, the iterations, and the elapsed time of the training.
       */
  def train(
    trainingSet: synapticLib.synapticMod.TrainerNs.TrainingSet,
    trainingOptions: synapticLib.synapticMod.TrainerNs.TrainingOptions
  ): synapticLib.synapticMod.TrainerNs.TrainingResult = js.native
  /**
       * This method allows you to train any training set to a Network.
       * @returns When the training is done this method returns an object with the error, the iterations, and the elapsed time of the training.
       */
  def trainAsync(trainingSet: synapticLib.synapticMod.TrainerNs.TrainingSet): stdLib.Promise[synapticLib.synapticMod.TrainerNs.TrainingResult] = js.native
  /**
       * This method allows you to train any training set to a Network.
       * @returns When the training is done this method returns an object with the error, the iterations, and the elapsed time of the training.
       */
  def trainAsync(
    trainingSet: synapticLib.synapticMod.TrainerNs.TrainingSet,
    trainingOptions: synapticLib.synapticMod.TrainerNs.TrainingOptions
  ): stdLib.Promise[synapticLib.synapticMod.TrainerNs.TrainingResult] = js.native
}

