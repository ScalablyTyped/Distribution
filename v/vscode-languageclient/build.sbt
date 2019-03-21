organization := "org.scalablytyped"
name := "vscode-languageclient"
version := "5.2.1-dfff01"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190319Z-4635bc",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cc5b51",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "vscode" % "1.19-dt-20190320Z-9705fd",
  "org.scalablytyped" %%% "vscode-jsonrpc" % "4.0.0-a8ee85",
  "org.scalablytyped" %%% "vscode-languageserver-protocol" % "3.14.1-b60891",
  "org.scalablytyped" %%% "vscode-languageserver-types" % "3.14.0-6de151")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        