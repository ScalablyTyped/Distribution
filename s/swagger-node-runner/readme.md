```
// Type definitions for swagger-node-runner 0.5
// Project: https://www.npmjs.com/package/swagger-node-runner
// Definitions by: Michael Mrowetz <https://github.com/micmro>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 2.4
/* =================== USAGE ===================

import * as SwaggerNodeRunner from "swagger-node-runner";
import * as express from "express";

let app = express();
let config = {
        appRoot: __dirname
};

SwaggerNodeRunner.create(config, (err, runner) => {
        if (err) {
                throw err; // or handle error
        }
        let middleware = runner.expressMiddleware();
        middleware.register(app);

        const port = process.env.PORT || 10010;
        app.listen(port);

        console.log('try this:\ncurl http://127.0.0.1:' + port + '/v1/hello?name=Scott');
});

 =============================================== */

```